plugins {
    id("convention.library")
    id("convention.publishing")
    id("org.jetbrains.dokka")
}

description = "Nice and simple DSL for Espresso in Kotlin"

android {
    namespace = "io.github.kakaocup.kakao"
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
