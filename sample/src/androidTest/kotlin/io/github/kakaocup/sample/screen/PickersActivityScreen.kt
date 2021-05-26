package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.picker.date.KDatePickerDialog
import io.github.kakaocup.kakao.picker.time.KTimePickerDialog

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R

open class PickersActivityScreen : Screen<PickersActivityScreen>() {
    val selectDateButton: KView = KView { withId(R.id.select_date) }
    val selectTimeButton: KView = KView { withId(R.id.select_time) }

    val dateText: KTextView = KTextView {
        withId(R.id.date_field)
    }

    val timeText: KTextView = KTextView {
        withId(R.id.time_field)
    }

    val datePickerDialog: KDatePickerDialog = KDatePickerDialog()
    val timePickerDialog: KTimePickerDialog = KTimePickerDialog()
}
