@file:Suppress("unused")

package io.github.kakaoandroid.kakao.pager2

import android.view.View
import org.hamcrest.Matcher

/**
 * For internal use. Don't use manually.
 *
 * Holds type and corresponding provider function
 */
class KViewPagerItemType<out T : KViewPagerItem<*>>(val provideItem: (Matcher<View>) -> T)
