plugins {
    id("com.android.library")
    kotlin ("android")
    id("org.jetbrains.dokka")
}

android {
    namespace = "io.github.kakaocup.kakao"
    compileSdk = libs.versions.compileSdk.get().toInt()
    defaultConfig {
        minSdk = libs.versions.minSdk.get().toInt()
        multiDexEnabled = true
    }

    packaging.resources.excludes.add("META-INF/*")

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
    implementation(libs.androidx.test.espresso.web)
    implementation(libs.androidx.test.espresso.intents)
    implementation(libs.androidx.test.espresso.contrib)

    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.viewpager2)
    implementation(libs.androidx.swiperefreshlayout)
    implementation(libs.com.google.android.material)

    implementation(libs.androidx.multidex.multidex)

    dokkaHtmlPlugin(libs.org.jetbrains.dokka.kotlinAsJavaPlugin)
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
