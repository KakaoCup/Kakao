package io.github.kakaoandroid.sample.screen

import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.spinner.KSpinner
import io.github.kakaoandroid.kakao.spinner.KSpinnerItem
import io.github.kakaoandroid.sample.R

class SpinnerActivityScreen : Screen<SpinnerActivityScreen>() {
    val spinner = KSpinner(
        builder = { withId(R.id.spinner) },
        itemTypeBuilder = { itemType(::KSpinnerItem) }
    )
}
