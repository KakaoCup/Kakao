import io.github.kakaocup.withVersionCatalog

plugins {
    kotlin("android")
}

withVersionCatalog { libs ->
    kotlin {
        jvmToolchain(libs.versions.jvmVersion.get().toInt())
    }
}
