package io.github.kakaocup.kakao.picker.date

import android.view.View
import android.widget.DatePicker
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View for interact with default date picker
 *
 * @see DatePicker
 */
class KDatePicker : KBaseView<KDatePicker>, DatePickerAction, DatePickerAssertion {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
