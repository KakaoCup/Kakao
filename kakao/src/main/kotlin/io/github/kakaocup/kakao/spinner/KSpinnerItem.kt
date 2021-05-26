@file:Suppress("unused")

package io.github.kakaocup.kakao.spinner

import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.list.KAdapterItem
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.text.TextViewAssertions

/**
 * KTextView implementation of KAdapterItem
 *
 * Use this if you want to perform/assert on the root view of adapter item
 *
 * @param parent Matcher of the root view of adapter item
 * @see KAdapterItem
 */
class KSpinnerItem(parent: DataInteraction) : KAdapterItem<KTextView>(parent), TextViewAssertions
