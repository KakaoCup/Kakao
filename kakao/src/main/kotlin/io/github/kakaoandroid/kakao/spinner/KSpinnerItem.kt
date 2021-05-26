@file:Suppress("unused")

package io.github.kakaoandroid.kakao.spinner

import androidx.test.espresso.DataInteraction
import io.github.kakaoandroid.kakao.list.KAdapterItem
import io.github.kakaoandroid.kakao.text.KTextView
import io.github.kakaoandroid.kakao.text.TextViewAssertions

/**
 * KTextView implementation of KAdapterItem
 *
 * Use this if you want to perform/assert on the root view of adapter item
 *
 * @param parent Matcher of the root view of adapter item
 * @see KAdapterItem
 */
class KSpinnerItem(parent: DataInteraction) : KAdapterItem<KTextView>(parent), TextViewAssertions
