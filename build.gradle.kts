buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.2")
    }
}

repositories {
    gradlePluginPortal()
    google()
}

plugins {
    id("io.gitlab.arturbosch.detekt") version Versions.detekt
}

detekt {
    toolVersion = "1.17.1"
    input = files(subprojects.map {
        File(it.projectDir, "/src/main/kotlin")
    })
    buildUponDefaultConfig = true
    config = files("$projectDir/detekt-config.yml")
    baseline = file("$projectDir/detekt-baseline.xml")

    reports {
        html.enabled = true
        xml.enabled = true
    }
}

subprojects {
    repositories {
        mavenCentral()
        google()
    }

    group = Description.mavenGroup
}
