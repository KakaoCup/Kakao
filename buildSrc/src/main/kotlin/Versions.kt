import java.io.File

object Versions {
    val kakaoVersion = File("buildsystem/version").readText().trim()

    val kotlin = "1.5.10"
    val detekt = "1.17.1"
    val dokka = "1.4.32"
    val android_gradle = "4.2.1"
    val maven = "1.5"
    val oss = "4.5.4"
    val appcompat = "1.3.0"
    val recyclerview = "1.2.0"
    val viewpager2 = "1.0.0"
    val swiperefresh = "1.1.0"
    val annotation = "1.2.0"
    val design = "1.3.0"
    val espresso = "3.3.0"
    val espresso_rules = "1.3.0"
    val espresso_runner = "1.3.0"
    val junit = "4.13.2"
    val junit_ext = "1.1.2"
    val gradle_versions = "0.39.0"
}

object Libraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    val detekt = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${Versions.detekt}"
    val dokka = "org.jetbrains.dokka:kotlin-as-java-plugin:${Versions.dokka}"
    val dokka_gradle = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"
    val android_gradle = "com.android.tools.build:gradle:${Versions.android_gradle}"
    val maven = "com.github.dcendents:android-maven-gradle-plugin:${Versions.maven}"
    val oss = "org.jfrog.buildinfo:build-info-extractor-gradle:${Versions.oss}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val viewpager2 = "androidx.viewpager2:viewpager2:${Versions.viewpager2}"
    val swiperefresh = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefresh}"
    val annotation = "androidx.annotation:annotation:${Versions.annotation}"
    val design = "com.google.android.material:material:${Versions.design}"
    val espresso_runner = "androidx.test:runner:${Versions.espresso_runner}"
    val espresso_rules = "androidx.test:rules:${Versions.espresso_rules}"
    val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val espresso_web = "androidx.test.espresso:espresso-web:${Versions.espresso}"
    val espresso_contrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    val espresso_intents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"
    val junit = "junit:junit:${Versions.junit}"
    val junit_ext = "androidx.test.ext:junit:${Versions.junit_ext}"
    val gradle_versions = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradle_versions}"
}

object Description {
    val mavenGroup = "io.github.kakaocup"
}
