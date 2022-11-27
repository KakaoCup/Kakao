package io.github.kakaocup.kakao.common.matchers

import android.os.Build
import android.view.View
import androidx.annotation.RequiresApi
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description

class HoveredViewMatcher : BaseViewConditionMatcher("Hovered", { it.isHovered })

class DirtyViewMatcher : BaseViewConditionMatcher("Dirty", { it.isDirty })

class ActivatedViewMatcher : BaseViewConditionMatcher("Activated", { it.isActivated })

@RequiresApi(Build.VERSION_CODES.Q)
class ForceDarkAllowedViewMatcher : BaseViewConditionMatcher("ForceDarkAllowed", { it.isForceDarkAllowed })

class HapticFeedbackEnabledMatcher : BaseViewConditionMatcher("HapticFeedbackEnabled", { it.isHapticFeedbackEnabled })

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
class AutoHandwritingEnabledMatcher : BaseViewConditionMatcher("AutoHandwritingEnabled", { it.isAutoHandwritingEnabled })

abstract class BaseViewConditionMatcher(
    private val matchingParameterName: String,
    private val matchFunction: (View) -> Boolean
) : BoundedMatcher<View, View>(View::class.java) {
    private var matchingResult: Boolean? = null

    override fun describeTo(description: Description?) {
        description?.appendText("$matchingParameterName value is: $matchingResult")
    }

    override fun matchesSafely(view: View?) = (view?.let(matchFunction) ?: false).also { matchingResult = it }
}
