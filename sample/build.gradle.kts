plugins {
    id("com.android.application")
    id("kotlin-android")
    id("com.github.ben-manes.versions") version Versions.gradle_versions
}

android {
    compileSdkVersion(30)

    defaultConfig {
        minSdkVersion(14)
        targetSdkVersion(30)
        versionCode(1)
        versionName("1.0.0")
        testInstrumentationRunner("androidx.test.runner.AndroidJUnitRunner")
    }

    testOptions {
        animationsDisabled = true
    }

    sourceSets {
        getByName("main") {
            java.srcDir("src/main/kotlin")
            res.srcDir("src/main/res")
        }
        getByName("androidTest") {
            java.srcDir("src/androidTest/kotlin")
        }
    }
}

dependencies {
    implementation(Libraries.kotlin_stdlib)
    implementation(Libraries.appcompat)
    implementation(Libraries.recyclerview)
    implementation(Libraries.design)
    implementation(Libraries.viewpager2)
    implementation(Libraries.googleMaps)

    testImplementation(Libraries.junit)

    androidTestImplementation(project(":kakao"))
    androidTestImplementation(project(":googleMapsExtension"))

    androidTestImplementation(Libraries.annotation)
    androidTestImplementation(Libraries.espresso_runner)
    androidTestImplementation(Libraries.espresso_rules)
    androidTestImplementation(Libraries.espresso_intents)
    androidTestImplementation(Libraries.espresso_core)
    androidTestImplementation(Libraries.espresso_web)
    androidTestImplementation(Libraries.junit_ext)
}
