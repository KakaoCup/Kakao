package io.github.kakaocup.kakao.picker.time

import android.widget.TimePicker
import io.github.kakaocup.kakao.common.actions.BaseActions

/**
 * Provides assertions for time picker
 */
interface TimePickerAssertion : BaseActions {

    /**
     * Check if picker dialog contain selected time
     *
     * @param hour hour
     * @param minute monute
     */
    fun hasTime(hour: Int, minute: Int) {
        hasHour(hour)
        hasMinute(minute)
    }

    /**
     * Check if picker dialog contain selected hour
     *
     * @param hour hour
     */
    fun hasHour(hour: Int) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TimePicker) {
                if (hour != view.currentHour) {
                    throw AssertionError(
                        "Expected hour is $hour," +
                            " but actual is ${view.currentHour}"
                    )
                }
            } else {
                throw AssertionError("Expected TimePicker, but got $view")
            }
        }
    }

    /**
     * Check if picker dialog contain selected minute
     *
     * @param minute month
     */
    fun hasMinute(minute: Int) {
        view.check { view, notFoundException ->
            notFoundException?.let { throw AssertionError(it) }
            if (view is TimePicker) {
                if (minute != view.currentMinute) {
                    throw AssertionError(
                        "Expected minutes is $minute," +
                            " but actual is ${view.currentMinute}"
                    )
                }
            } else {
                throw AssertionError("Expected TimePicker, but got $view")
            }
        }
    }
}
