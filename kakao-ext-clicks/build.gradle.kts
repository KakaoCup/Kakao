plugins {
    id("convention.library")
    id("convention.publishing")
}

description = "Clicks extension for Kakao"

android {
    namespace = "io.github.kakaocup.kakao.ext.clicks"
}

dependencies {
    implementation(libs.androidx.test.espresso.core)
    implementation(project(":kakao"))
}
