package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.chip.KChip
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.R

open class ChipsScreen : Screen<ChipsScreen>() {
    val chip1: KChip = KChip { withId(R.id.chip1) }
    val chip2: KChip = KChip { withId(R.id.chip2) }
    val chip3: KChip = KChip { withId(R.id.chip3) }
    val chip4: KChip = KChip { withId(R.id.chip4) }
}
