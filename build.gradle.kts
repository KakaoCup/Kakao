plugins {
    id("io.gitlab.arturbosch.detekt") version libs.versions.detekt
}

detekt {
    toolVersion = libs.versions.detekt.get()
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

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = libs.versions.gradle.get()
}
