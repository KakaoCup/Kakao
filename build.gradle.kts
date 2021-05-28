buildscript {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
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
