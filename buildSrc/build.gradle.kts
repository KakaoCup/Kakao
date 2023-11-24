plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.org.jetbrains.kotlin.kotlinGradlePlugin )
    implementation(libs.com.android.tools.build.gradle)
    implementation(libs.org.jetbrains.dokka.dokkaGradlePlugin)
    implementation(libs.org.kohsuke.githubApi)
}
