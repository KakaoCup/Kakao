plugins {
    id("convention.application")
}

android {
    namespace = "io.github.kakaocup.sample"

    defaultConfig {
        versionCode = 1
        versionName = "1.0.0"
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.recyclerview)
    implementation(libs.com.google.android.material)
    implementation(libs.androidx.viewpager2)
    implementation(libs.androidx.multidex.multidex)

    testImplementation(libs.junit.junit)

    androidTestImplementation(project(":kakao"))
    androidTestImplementation(project(":kakao-ext-clicks"))

    androidTestImplementation(libs.androidx.annotation)
    androidTestImplementation(libs.androidx.test.runner)
    androidTestImplementation(libs.androidx.test.rules)
    androidTestImplementation(libs.androidx.test.espresso.intents)
    androidTestImplementation(libs.androidx.test.espresso.core)
    androidTestImplementation(libs.androidx.test.espresso.web)
    androidTestImplementation(libs.androidx.test.ext.junit)
}
