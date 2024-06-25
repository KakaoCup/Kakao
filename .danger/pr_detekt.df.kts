@file:DependsOn("io.github.vacxe.danger.kotlin:detekt:1.1.0")

import systems.danger.kotlin.*
import systems.danger.kotlin.models.github.*
import io.github.vacxe.danger.kotlin.detekt.*
import java.io.File

val detektPlugin = DetektPlugin { it.removePrefix("/home/runner/work/Kakao/Kakao/") }
register.plugin(detektPlugin)

danger(args) {
    detektReport()
}

fun detektReport() {
    val detektReportFile = File("build/reports/detekt/detekt.xml")
    if (!detektReportFile.exists()) {
        warn(
            "Detekt report not exist",
        )
    } else {
        detektPlugin.parseAndReport(detektReportFile)
    }
}
