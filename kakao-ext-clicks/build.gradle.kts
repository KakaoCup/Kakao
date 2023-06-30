plugins {
    id("com.android.library")
    id("kotlin-android")
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
    implementation(Libraries.espresso_core)
    implementation(project(":kakao"))
}
