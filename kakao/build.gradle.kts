plugins {
    id("com.android.library")
    id("kotlin-android")
    id("org.jetbrains.dokka")
    id("com.github.ben-manes.versions") version Versions.gradle_versions
}

android {
    compileSdk = 33
    defaultConfig {
        minSdk = 14
        targetSdk = 33
        multiDexEnabled = true
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
            res.srcDir("src/main/res")
        }
        getByName("test") {
            java.srcDir("src/test/kotlin")
        }
    }
}

dependencies {
    implementation(Libraries.kotlin_stdlib)
    implementation(Libraries.appcompat)
    implementation(Libraries.recyclerview)
    implementation(Libraries.viewpager2)
    implementation(Libraries.swiperefresh)
    implementation(Libraries.design)
    implementation(Libraries.espresso_core)
    implementation(Libraries.espresso_web)
    implementation(Libraries.espresso_intents)
    implementation(Libraries.espresso_contrib)
    implementation(Libraries.multidex)

    dokkaHtmlPlugin(Libraries.dokka)
}

tasks.named("dependencyUpdates", com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class).configure {
    rejectVersionIf {
        val stableKeyword: Boolean = listOf("RELEASE", "FINAL", "GA").any { currentVersion.toUpperCase().contains(it) }
        val regex = "/^[0-9,.v-]+(-r)?$/".toRegex()
        !stableKeyword && !(regex.matches(currentVersion))
    }
}

tasks.dokkaGfm {
    moduleName.set("kakao")
    outputDirectory.set(File("$rootDir/docs"))
}
tasks.dokkaHtml.configure {
    moduleName.set("kakao")
    outputDirectory.set(File("$rootDir/html"))
}

afterEvaluate {
    KakaoDeployment.initialize(project)
}
