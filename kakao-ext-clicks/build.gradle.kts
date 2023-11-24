plugins {
    id("com.android.library")
    kotlin("android")
}

android {
    namespace = "io.github.kakaocup.kakao.ext.clicks"
    compileSdk = libs.versions.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        multiDexEnabled = true
    }

    kotlin {
        jvmToolchain(libs.versions.jvmVersion.get().toInt())
    }

    publishing {
        singleVariant("release") {
            withJavadocJar()
            withSourcesJar()
        }
    }
}

dependencies {
    implementation(libs.androidx.test.espresso.core)
    implementation(project(":kakao"))
}

afterEvaluate {
    KakaoExtClicksDeployment.initialize(project)
}
