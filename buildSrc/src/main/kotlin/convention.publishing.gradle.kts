import com.android.build.gradle.LibraryExtension
import io.github.kakaocup.Github
import java.net.URI

plugins {
    id("maven-publish")
    id("signing")
}

val ghToken: String? = System.getenv("GH_TOKEN")

val releaseMode: String? by project
val versionSuffix = when (releaseMode) {
    "RELEASE" -> ""
    else -> "-SNAPSHOT"
}

group = "io.github.kakaocup"
version = readVersion() + versionSuffix

configure<PublishingExtension> {
    publications {
        create<MavenPublication>("default") {
            groupId = project.group.toString()

            components.whenObjectAdded {
                if (this.name == "release") {
                    from(components["release"])
                }
            }

            pom {
                name.set(project.name)
                url.set("https://github.com/KakaoCup/Kakao")
                description.set(project.description ?: "Nice and simple DSL for Espresso in Kotlin")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                developers(findCollaborators())
                //contributors(findContributors()) Failing

                scm {
                    url.set("https://github.com/KakaoCup/Kakao.git")
                    connection.set("scm:git:ssh://github.com/KakaoCup/Kakao")
                    developerConnection.set("scm:git:ssh://github.com/KakaoCup/Kakao")
                }
            }
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
                username = System.getenv("SONATYPE_USERNAME")
                password = System.getenv("SONATYPE_PASSWORD")
            }
            url = URI.create(
                when (releaseMode) {
                    "RELEASE" -> System.getenv("SONATYPE_RELEASES_URL")
                        ?: "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"

                    else -> System.getenv("SONATYPE_SNAPSHOTS_URL")
                        ?: "https://s01.oss.sonatype.org/content/repositories/snapshots/"
                }
            )
        }
    }
}

plugins.withId("com.android.library") {
    configure<LibraryExtension> {
        publishing {
            singleVariant("release") {
                withJavadocJar()
                withSourcesJar()
            }
        }
    }
}

val passphrase: String? = System.getenv("GPG_PASSPHRASE")

if (!passphrase.isNullOrBlank()) {
    project.configure<SigningExtension> {
        sign(publishing.publications.getByName("default"))
    }

    project.extra.set("signing.keyId", "0110979F")
    project.extra.set("signing.password", passphrase)
    project.extra.set("signing.secretKeyRingFile", "${project.rootProject.rootDir}/buildsystem/secring.gpg")
}

fun readVersion(): String {
    return project.layout.projectDirectory.file("version").asFile.readText().trim()
}

fun findCollaborators() = Action<MavenPomDeveloperSpec> {
    if (!ghToken.isNullOrEmpty()) {
        Github(ghToken).collaborators.forEach {
            developer {
                id.set(it.login)
                url.set("https://github.com/${it.login}")
                name.set(it.name)
            }
        }
    }
}

fun findContributors() = Action<MavenPomContributorSpec> {
    if (!ghToken.isNullOrEmpty()) {
        Github(ghToken).contributors.sortedBy { it.login }.forEach {
            contributor {
                name.set(it.login)
                url.set("https://github.com/${it.login}")
            }
        }
    }
}
