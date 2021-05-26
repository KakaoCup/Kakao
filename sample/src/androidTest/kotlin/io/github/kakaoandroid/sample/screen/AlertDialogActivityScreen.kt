package io.github.kakaoandroid.sample.screen

import io.github.kakaoandroid.kakao.common.views.KView
import io.github.kakaoandroid.kakao.dialog.KAlertDialog
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.sample.R

open class AlertDialogActivityScreen : Screen<AlertDialogActivityScreen>() {
    val showAlertDialogButton = KView { withId(R.id.show_alert_dialog) }

    val alertDialog = KAlertDialog()
}
