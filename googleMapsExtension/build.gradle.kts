plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.github.ben-manes.versions") version Versions.gradle_versions
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(14)
        targetSdkVersion(30)
        versionCode(2)
        versionName(Versions.gmapsVersion)
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
    implementation(project(":kakao"))
    implementation(Libraries.kotlin_stdlib)
    implementation(Libraries.googleMaps)
    implementation(Libraries.espresso_core)
    implementation(Libraries.espresso_web)
    implementation(Libraries.espresso_intents)
    implementation(Libraries.espresso_contrib)
    implementation(Libraries.junit_ext)
    implementation(Libraries.junit)
    implementation(Libraries.multidex)
}

tasks.named("dependencyUpdates", com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask::class).configure {
    rejectVersionIf {
        val stableKeyword: Boolean = listOf("RELEASE", "FINAL", "GA").any { currentVersion.toUpperCase().contains(it) }
        val regex = "/^[0-9,.v-]+(-r)?$/".toRegex()
        !stableKeyword && !(regex.matches(currentVersion))
    }
}
