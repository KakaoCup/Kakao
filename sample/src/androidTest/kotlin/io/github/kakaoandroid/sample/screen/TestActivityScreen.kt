package io.github.kakaoandroid.sample.screen

import io.github.kakaoandroid.kakao.common.views.KView
import io.github.kakaoandroid.kakao.progress.KSeekBar
import io.github.kakaoandroid.kakao.rating.KRatingBar
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.searchview.KSearchView
import io.github.kakaoandroid.kakao.switch.KSwitch
import io.github.kakaoandroid.kakao.text.KButton
import io.github.kakaoandroid.kakao.text.KSnackbar
import io.github.kakaoandroid.kakao.text.KTextView
import io.github.kakaoandroid.kakao.toolbar.KToolbar
import io.github.kakaoandroid.sample.R

open class TestActivityScreen : Screen<TestActivityScreen>() {
    val content: KView = KView { withId(R.id.content) }
    val map: KView = KView { withId(R.id.map) }
    val multiTypeRecycler: KButton = KButton { withId(R.id.multi_type_recycler) }
    val singleTypeRecycler: KButton = KButton { withId(R.id.single_type_recycler) }
    val autoComplete: KButton = KButton { withId(R.id.auto_complete) }
    val snackbarButton: KButton = KButton { withId(R.id.snackbar_button) }
    val toolbar: KToolbar = KToolbar { withId(R.id.action_bar) }

    val textViewLarge: KTextView = KTextView {
        withId(R.id.text_view_large)
    }

    val textViewSmall: KTextView = KTextView {
        withId(R.id.text_view_small)
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
