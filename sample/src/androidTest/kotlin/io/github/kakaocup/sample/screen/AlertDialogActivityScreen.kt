package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.dialog.KAlertDialog
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.R

open class AlertDialogActivityScreen : Screen<AlertDialogActivityScreen>() {
    val showAlertDialogButton = KView { withId(R.id.show_alert_dialog) }
    val showMultiChoiceAlertDialogButton = KView { withId(R.id.show_multi_choice_dialog) }

    val alertDialog = KAlertDialog()
}
