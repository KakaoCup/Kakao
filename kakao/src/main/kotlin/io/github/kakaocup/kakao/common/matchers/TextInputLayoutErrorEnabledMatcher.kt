@file:Suppress("unused")

package io.github.kakaocup.kakao.common.matchers

import android.view.View
import com.google.android.material.textfield.TextInputLayout
import org.hamcrest.Description
import org.hamcrest.TypeSafeMatcher

class TextInputLayoutErrorEnabledMatcher(private val enabled: Boolean) : TypeSafeMatcher<View>() {
    override fun matchesSafely(item: View?): Boolean {
        return item?.let {
            if (item is TextInputLayout) {
                item.isErrorEnabled == enabled
            } else false
        } ?: false
    }

    override fun describeTo(desc: Description) {
        desc.appendText("with error state: ")
            .appendValue(enabled)
    }
}
