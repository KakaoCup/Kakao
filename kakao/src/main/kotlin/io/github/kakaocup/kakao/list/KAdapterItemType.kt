@file:Suppress("unused")

package io.github.kakaocup.kakao.list

import androidx.test.espresso.DataInteraction

/**
 * For internal use. Don't use manually.
 *
 * Holds type and corresponding provider function
 */
class KAdapterItemType<out T : KAdapterItem<*>>(val provideItem: (DataInteraction) -> T)
