package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.spinner.KSpinner
import io.github.kakaocup.kakao.spinner.KSpinnerItem
import io.github.kakaocup.sample.R

class SpinnerActivityScreen : Screen<SpinnerActivityScreen>() {
    val spinner = KSpinner(
        builder = { withId(R.id.spinner) },
        itemTypeBuilder = { itemType(::KSpinnerItem) }
    )
}
