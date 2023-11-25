plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "io.github.kakaocup.sample"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        minSdk = 21
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.0.0"
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    testOptions {
        animationsDisabled = true
    }

    signingConfigs {
        create("kakao") {
            storeFile = File("${project.rootDir}/buildsystem/debug.keystore")
            storePassword = "android"
            keyAlias = "kakaodebugkey"
            keyPassword = "android"
        }
    }

    buildTypes {
        debug { signingConfig = signingConfigs.getByName("kakao") }
    }

    kotlin {
        jvmToolchain(libs.versions.jvmVersion.get().toInt())
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.recyclerview)
    implementation(libs.com.google.android.material)
    implementation(libs.androidx.viewpager2)
    implementation(libs.androidx.multidex.multidex)

    testImplementation(libs.junit.junit)

    androidTestImplementation(project(":kakao"))
    androidTestImplementation(project(":kakao-ext-clicks"))

    androidTestImplementation(libs.androidx.annotation)
    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.androidx.test.rules)
    androidTestImplementation(libs.androidx.test.espresso.intents)
    androidTestImplementation(libs.androidx.test.espresso.core)
    androidTestImplementation(libs.androidx.test.espresso.web)
    androidTestImplementation(libs.androidx.test.ext.junit)
}
