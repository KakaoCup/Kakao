package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.common.views.KView
import io.github.kakaocup.kakao.progress.KSeekBar
import io.github.kakaocup.kakao.rating.KRatingBar
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.searchview.KSearchView
import io.github.kakaocup.kakao.switch.KSwitch
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KSnackbar
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.kakao.toolbar.KToolbar
import io.github.kakaocup.sample.R

open class TestActivityScreen : Screen<TestActivityScreen>() {
    val content: KView = KView { withId(R.id.content) }
    val map: KView = KView { withId(R.id.map) }
    val multiTypeRecycler: KButton = KButton { withId(R.id.multi_type_recycler) }
    val singleTypeRecycler: KButton = KButton { withId(R.id.single_type_recycler) }
    val autoComplete: KButton = KButton { withId(R.id.auto_complete) }
    val snackbarButton: KButton = KButton { withId(R.id.snackbar_button) }
    val toolbar: KToolbar = KToolbar { withId(com.google.android.material.R.id.action_bar) }

    val textViewLarge: KTextView = KTextView {
        withId(R.id.text_view_large)
    }

    val textViewSmall: KTextView = KTextView {
        withId(R.id.text_view_small)
    }

    val textViewHint: KTextView = KTextView {
        withHint("hint")
    }

    val buttonViewLeft: KButton = KButton {
        withId(R.id.button_view_left)
    }

    val buttonViewRight: KButton = KButton {
        withId(R.id.button_view_right)
    }

    val textViewColored: KTextView = KTextView {
        withId(R.id.text_view_colored)
    }

    val ratingbar: KRatingBar = KRatingBar { withId(R.id.rating_bar) }
    val seekbar: KSeekBar = KSeekBar { withId(R.id.seek_bar) }
    val switch: KSwitch = KSwitch { withId(R.id.switch_view) }
    val switchCompat: KSwitch = KSwitch { withId(R.id.switch_compat) }
    val nestedTextView: KTextView = KTextView { withId(R.id.nested_scroll_text_view) }

    val snackbar: KSnackbar = KSnackbar()

    val searchView: KSearchView = KSearchView { withId(R.id.search_view) }
}
