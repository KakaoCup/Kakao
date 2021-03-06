package io.github.kakaocup.kakao.picker.time

import android.app.TimePickerDialog
import android.widget.TimePicker
import io.github.kakaocup.kakao.common.views.KBaseView
import io.github.kakaocup.kakao.text.KButton

/**
 * View for interact with default date picker dialog
 *
 * @see TimePickerDialog
 */
class KTimePickerDialog : KBaseView<KTimePickerDialog>({ isRoot() }) {

    init {
        inRoot { isDialog() }
    }

    val timePicker = KTimePicker { isInstanceOf(TimePicker::class.java) }.also {
        it.inRoot { isDialog() }
    }

    val okButton = KButton { withId(android.R.id.button1) }
        .also { it.inRoot { isDialog() } }

    val cancelButton = KButton { withId(android.R.id.button2) }
        .also { it.inRoot { isDialog() } }
}
