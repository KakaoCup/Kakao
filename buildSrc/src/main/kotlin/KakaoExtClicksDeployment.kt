@file:Suppress("DEPRECATION")

import com.android.build.gradle.LibraryExtension
import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.plugins.JavaPluginConvention
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPom
import org.gradle.api.publish.maven.MavenPomContributorSpec
import org.gradle.api.publish.maven.MavenPomDeveloperSpec
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.tasks.bundling.Jar
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.creating
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.provideDelegate
import org.gradle.kotlin.dsl.the
import org.gradle.plugins.signing.SigningExtension
import org.jetbrains.dokka.gradle.DokkaTask
import java.net.URI

object KakaoExtClicksDeployment {
    val ghToken = System.getenv("GH_TOKEN")
    val sonatypeUser = System.getenv("SONATYPE_USERNAME")
    val sonatypePassword = System.getenv("SONATYPE_PASSWORD")
    var releaseMode: String? = null
    var versionSuffix: String? = null
    var deployUrl: String? = null

    val snapshotDeployUrl = System.getenv("SONATYPE_SNAPSHOTS_URL")
        ?: "https://s01.oss.sonatype.org/content/repositories/snapshots/"
    val releaseDeployUrl = System.getenv("SONATYPE_RELEASES_URL")
        ?: "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"

    fun initialize(project: Project) {
        val releaseMode: String? by project
        val versionSuffix = when (releaseMode) {
            "RELEASE" -> ""
            else -> "-SNAPSHOT"
        }

        KakaoExtClicksDeployment.releaseMode = releaseMode
        KakaoExtClicksDeployment.versionSuffix = versionSuffix
        deployUrl = when (releaseMode) {
            "RELEASE" -> releaseDeployUrl
            else -> snapshotDeployUrl
        }

        initializePublishing(project)
        initializeSigning(project)
    }

    private fun initializePublishing(project: Project) {
        project.version = Versions.kakaoExtClicksVersion + versionSuffix

        project.plugins.apply("maven-publish")

        val (component, additionalArtifacts) = when {
            project.extensions.findByType(LibraryExtension::class) != null -> {
                val android = project.extensions.findByType(LibraryExtension::class)!!
                val main = android.sourceSets.getByName("main")
                val sourcesJar by project.tasks.creating(Jar::class) {
                    classifier = "sources"
                    from(main.java.srcDirs)
                }

                Pair(project.components["release"], listOf(sourcesJar))
            }
            project.the(JavaPluginConvention::class) != null -> {
                val javaPlugin = project.the(JavaPluginConvention::class)

                val sourcesJar by project.tasks.creating(Jar::class) {
                    classifier = "sources"
                    from(javaPlugin.sourceSets["main"].allSource)
                }
                Pair(project.components["java"], listOf(sourcesJar))
            }
            else -> {
                throw RuntimeException("Unknown plugin")
            }
        }

        project.configure<PublishingExtension> {
            publications {
                create("default", MavenPublication::class.java) {
                    KakaoExtClicksDeployment.customizePom(pom)
                    additionalArtifacts.forEach { it ->
                        artifact(it)
                    }
                    from(component)
                }
            }
            repositories {
                maven {
                    name = "Local"
                    setUrl("${project.rootDir}/build/repository")
                }
                maven {
                    name = "OSSHR"
                    credentials {
                        username = sonatypeUser
                        password = sonatypePassword
                    }
                    url = URI.create(deployUrl)
                }
            }
        }
    }

    private fun initializeSigning(project: Project) {
        val passphrase = System.getenv("GPG_PASSPHRASE")
        passphrase?.let {
            project.plugins.apply("signing")

            val publishing = project.the(PublishingExtension::class)
            project.configure<SigningExtension> {
                sign(publishing.publications.getByName("default"))
            }

            project.extra.set("signing.keyId", "0110979F")
            project.extra.set("signing.password", passphrase)
            project.extra.set("signing.secretKeyRingFile", "${project.rootProject.rootDir}/buildsystem/secring.gpg")
        }
    }

    fun customizePom(pom: MavenPom?) {
        pom?.apply {
            name.set("kakao-ext-clicks")
            url.set("https://github.com/KakaoCup/Kakao/kakao-ext-clicks")
            description.set("Clicks extension for Kakao")

            licenses {
                license {
                    name.set("The Apache License, Version 2.0")
                    url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                }
            }

            developers {
                developer {
                    id.set("vacxe")
                    url.set("https://github.com/vacxe")
                    name.set("Konstantin Aksenov")
                }

                developer {
                    id.set("dsvoronin")
                    url.set("https://github.com/dsvoronin")
                    name.set("Dmitriy Voronin")
                }
            }

            scm {
                url.set("https://github.com/KakaoCup/Kakao.git")
                connection.set("scm:git:ssh://github.com/KakaoCup/Kakao")
                developerConnection.set("scm:git:ssh://github.com/KakaoCup/Kakao")
            }
        }
    }
}
