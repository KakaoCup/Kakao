@file:Suppress("unused")

package io.github.kakaocup.kakao.common.matchers

import android.view.View
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import java.lang.ref.WeakReference

/**
 * Matches index'th view that matches given matcher
 *
 * @param matcher Matcher that have several matching views
 * @param index index of view that must be matched
 */
class IndexMatcher(private val matcher: Matcher<View>, private val index: Int) : TypeSafeMatcher<View>() {
    private var currentIndex = 0
    private var seenProvider: WeakReference<MutableSet<View>>? = null

    override fun describeTo(desc: Description) {
        desc.appendText("${index}th view with: ")
            .appendDescriptionOf(matcher)
    }

    public override fun matchesSafely(view: View): Boolean {
        val seen = if (seenProvider?.get() == null) {
            val mutableSetOf = mutableSetOf<View>()
            seenProvider = WeakReference(mutableSetOf)
            mutableSetOf
        } else {
            seenProvider!!.get()!!
        }

        if (seen.contains(view)) {
            currentIndex = 0
            seen.clear()
        }

        seen.add(view)
        return matcher.matches(view) && currentIndex++ == index
    }
}
