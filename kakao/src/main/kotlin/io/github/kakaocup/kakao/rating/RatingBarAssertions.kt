@file:Suppress("unused")

package io.github.kakaocup.kakao.rating

import androidx.test.espresso.assertion.ViewAssertions
import io.github.kakaocup.kakao.common.assertions.BaseAssertions
import io.github.kakaocup.kakao.common.matchers.RatingBarMatcher

/**
 * Provides assertions for RatingBar
 */
interface RatingBarAssertions : BaseAssertions {
    /**
     *  Checks if RatingBar has number of rating as expected
     *
     *  @param number rating as expected
     */
    fun hasRating(number: Float) {
        view.check(ViewAssertions.matches(RatingBarMatcher(number)))
    }
}
