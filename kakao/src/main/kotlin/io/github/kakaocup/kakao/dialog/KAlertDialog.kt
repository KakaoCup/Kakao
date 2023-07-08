package io.github.kakaocup.kakao.dialog

import android.app.AlertDialog
import io.github.kakaocup.kakao.check.KCheckBox
import io.github.kakaocup.kakao.common.views.KBaseView
import io.github.kakaocup.kakao.image.KImageView
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView

/**
 * View for interact with default alert dialog
 *
 * @see AlertDialog
 */
class KAlertDialog : KBaseView<KAlertDialog>({ isRoot() }) {

    init {
        inRoot { isDialog() }
    }

    val positiveButton = KButton { withId(android.R.id.button1) }
        .also { it.inRoot { isDialog() } }

    val negativeButton = KButton { withId(android.R.id.button2) }
        .also { it.inRoot { isDialog() } }

    val neutralButton = KButton { withId(android.R.id.button3) }
        .also { it.inRoot { isDialog() } }

    val title = KTextView { withResourceName("alertTitle") }
        .also { it.inRoot { isDialog() } }

    val message = KTextView { withId(android.R.id.message) }
        .also { it.inRoot { isDialog() } }

    val icon = KImageView { withId(android.R.id.icon) }
        .also { it.inRoot { isDialog() } }

    fun onChoiceItem(title: String, function: KCheckBox.() -> Unit) = onChoiceItem(title).perform(function)

    fun onChoiceItem(title: String) = KCheckBox {
        withText(title)
        withId(android.R.id.text1)
    }.also { it.inRoot { isDialog() } }

    fun hasChoiceItems(vararg titles: String) {
        titles.toList().forEach {
            onChoiceItem(it).isDisplayed()
        }
    }
}
