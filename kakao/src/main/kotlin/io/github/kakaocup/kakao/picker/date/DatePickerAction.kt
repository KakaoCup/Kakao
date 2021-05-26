package io.github.kakaocup.kakao.picker.date

import androidx.test.espresso.contrib.PickerActions
import io.github.kakaocup.kakao.common.actions.BaseActions

/**
 * Provides actions for date picker
 */
interface DatePickerAction : BaseActions {
    /**
     * Set date to picker dialog
     * Month number will be normalized
     *
     * @param year year
     * @param monthOfYear month
     * @param day day
     */
    fun setDate(year: Int, monthOfYear: Int, day: Int) = view.perform(PickerActions.setDate(year, monthOfYear, day))
}
