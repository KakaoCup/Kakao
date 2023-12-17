plugins {
    id("com.android.library")
    id("convention.android-base")
    id("convention.kotlin")
}

android {
    packaging.resources.excludes.add("META-INF/*")
}
