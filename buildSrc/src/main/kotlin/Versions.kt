import java.io.File

object Versions {
    val kakaoVersion = File("buildsystem/version").readText().trim()
    val kakaoExtClicksVersion = File("buildsystem/extclickversion").readText().trim()
}

object Description {
    val mavenGroup = "io.github.kakaocup"
}
