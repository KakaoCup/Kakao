package io.github.kakaoandroid.sample.screen

import io.github.kakaoandroid.kakao.common.views.KView
import io.github.kakaoandroid.kakao.picker.date.KDatePickerDialog
import io.github.kakaoandroid.kakao.picker.time.KTimePickerDialog

import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.text.KTextView
import io.github.kakaoandroid.sample.R

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
