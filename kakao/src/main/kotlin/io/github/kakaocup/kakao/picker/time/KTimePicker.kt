package io.github.kakaocup.kakao.picker.time

import android.view.View
import android.widget.TimePicker
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View for interact with default time picker
 *
 * @see TimePicker
 */
class KTimePicker : KBaseView<KTimePicker>, TimePickerAction, TimePickerAssertion {
    constructor(function: ViewBuilder.() -> Unit) : super(function)
    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function)
    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function)
}
