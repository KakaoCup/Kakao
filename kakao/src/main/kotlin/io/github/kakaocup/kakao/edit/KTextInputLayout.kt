@file:Suppress("unused")

package io.github.kakaocup.kakao.edit

import android.view.View
import android.widget.EditText
import androidx.test.espresso.DataInteraction
import io.github.kakaocup.kakao.common.builders.ViewBuilder
import io.github.kakaocup.kakao.common.views.KBaseView
import org.hamcrest.Matcher

/**
 * View with TextInputLayoutAssertions
 *
 * @see TextInputLayoutAssertions
 */
class KTextInputLayout : KBaseView<KTextInputLayout>, TextInputLayoutAssertions {
    val edit: KEditText

    constructor(function: ViewBuilder.() -> Unit) : super(function) {
        edit = KEditText {
            isAssignableFrom(EditText::class.java)
            isDescendantOfA(function)
        }
    }

    constructor(parent: Matcher<View>, function: ViewBuilder.() -> Unit) : super(parent, function) {
        edit = KEditText {
            isAssignableFrom(EditText::class.java)
            isDescendantOfA(function)
        }
    }

    constructor(parent: DataInteraction, function: ViewBuilder.() -> Unit) : super(parent, function) {
        edit = KEditText {
            isAssignableFrom(EditText::class.java)
            isDescendantOfA(function)
        }
    }
}
