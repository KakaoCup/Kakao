import com.android.build.gradle.AppExtension
import io.github.kakaocup.withVersionCatalog

plugins {
    id("com.android.application")
    id("convention.android-base")
    id("convention.kotlin")
}

withVersionCatalog { libs ->
    configure<AppExtension>() {
        defaultConfig {
            targetSdk = libs.versions.targetSdk.get().toInt()
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

        testOptions {
            animationsDisabled = true
        }

        signingConfigs {
            create("kakao") {
                storeFile = rootProject.layout.projectDirectory.file("buildsystem/debug.keystore").asFile
                storePassword = "android"
                keyAlias = "kakaodebugkey"
                keyPassword = "android"
            }
        }

        buildTypes {
            named("debug") {
                signingConfig = signingConfigs.getByName("kakao")
            }
        }
    }
}
