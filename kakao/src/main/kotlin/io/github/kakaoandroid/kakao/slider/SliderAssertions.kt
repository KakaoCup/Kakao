package io.github.kakaoandroid.kakao.slider

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaoandroid.kakao.common.assertions.BaseAssertions
import io.github.kakaoandroid.kakao.common.matchers.SliderMatcher

interface SliderAssertions : BaseAssertions {
    fun hasValue(value: Float) {
        view.check(
            ViewAssertions.matches(SliderMatcher(value))
        )
    }
}
