@file:Suppress("unused")

package io.github.kakaocup.kakao.text

import io.github.kakaocup.kakao.common.views.KBaseView
import com.google.android.material.snackbar.Snackbar

/**
 * View with internal TextView and a Button
 *
 * @see Snackbar
 */
class KSnackbar : KBaseView<KSnackbar>({ isInstanceOf(Snackbar.SnackbarLayout::class.java) }) {
    val text = KTextView {
        isDescendantOfA { isInstanceOf(Snackbar.SnackbarLayout::class.java) }
        withId(com.google.android.material.R.id.snackbar_text)
    }

    val action = KButton {
        isDescendantOfA { isInstanceOf(Snackbar.SnackbarLayout::class.java) }
        withId(com.google.android.material.R.id.snackbar_action)
    }
}
