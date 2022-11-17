plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.21")
    implementation("com.android.tools.build:gradle:7.3.1")
    implementation("org.jetbrains.dokka:dokka-gradle-plugin:1.7.20")
    implementation("org.kohsuke:github-api:1.129")
}
