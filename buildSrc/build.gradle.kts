plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.org.jetbrains.kotlin.kotlinGradlePlugin)
    implementation(libs.com.android.tools.build.gradle)
    implementation(libs.org.jetbrains.dokka.dokkaGradlePlugin)
    implementation(libs.org.kohsuke.githubApi)
    // workaround for https://github.com/gradle/gradle/issues/15383
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
