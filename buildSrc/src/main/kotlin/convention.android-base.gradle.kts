import com.android.build.gradle.BaseExtension
import io.github.kakaocup.withVersionCatalog

withVersionCatalog { libs ->
    configure<BaseExtension> {
        compileSdkVersion(libs.versions.compileSdk.get().toInt())
        defaultConfig {
            minSdk = libs.versions.minSdk.get().toInt()
            multiDexEnabled = true
        }
    }
}
