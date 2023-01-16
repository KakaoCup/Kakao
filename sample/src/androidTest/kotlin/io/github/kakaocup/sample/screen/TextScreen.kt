package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R

class TextScreen : Screen<TextScreen>() {
    val textViewPlain = KTextView { withId(R.id.plain_text_view) }
    val textViewWithLeftDrawable = KTextView { withId(R.id.text_view_drawable_left) }
    val textViewWithRightDrawable = KTextView { withId(R.id.text_view_drawable_right) }
    val textViewWithTopDrawable = KTextView { withId(R.id.text_view_drawable_top) }
    val textViewWithBottomDrawable = KTextView { withId(R.id.text_view_drawable_bottom) }

    val textViewCentered = KTextView { withId(R.id.text_view_gravity_center) }
    val textViewOnStart = KTextView { withId(R.id.text_view_gravity_start) }
    val textViewOnEnd = KTextView { withId(R.id.text_view_gravity_end) }
    val textViewOnTop = KTextView { withId(R.id.text_view_gravity_top) }
    val textViewOnBottom = KTextView { withId(R.id.text_view_gravity_bottom) }
    val textViewOnTopLeft = KTextView { withId(R.id.text_view_gravity_top_left) }
    val textViewOnBottomRight = KTextView { withId(R.id.text_view_gravity_bottom_right) }
    val textViewHorizontalCenteredTop = KTextView { withId(R.id.text_view_gravity_horizontal_center_top) }
    val textViewVerticalCenteredEnd = KTextView { withId(R.id.text_view_gravity_vertical_center_end) }

    val textViewSize14Sp = KTextView { withId(R.id.text_view_size_14sp) }
    val textViewSize19Sp = KTextView { withId(R.id.text_view_size_19sp) }
    val textViewSize32Sp = KTextView { withId(R.id.text_view_size_32sp) }

    val textViewTypefaceNormal = KTextView { withId(R.id.text_view_typeface_normal) }
    val textViewTypefaceMonospace = KTextView { withId(R.id.text_view_typeface_monospace) }
    val textViewTypefaceNormalBold = KTextView { withId(R.id.text_view_typeface_normal_bold) }
    val textViewTypefaceSansItalic = KTextView { withId(R.id.text_view_typeface_sans_italic) }
    val textViewTypefaceSerifBoldItalic = KTextView { withId(R.id.text_view_typeface_serif_bold_italic) }

    val textViewMultipleClickableSpans = KTextView { withId(R.id.text_view_multiple_clickable_spans) }

    val textViewWithLeftSpanDrawable = KTextView { withId(R.id.text_view_drawable_span_left) }
    val textViewWithRightSpanDrawable = KTextView { withId(R.id.text_view_drawable_span_right) }
    val textViewWithMultipleSpanDrawable = KTextView { withId(R.id.text_view_drawable_span_multiple) }
}
