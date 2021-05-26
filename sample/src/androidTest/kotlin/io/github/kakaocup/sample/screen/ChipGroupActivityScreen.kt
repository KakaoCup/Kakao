package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.chipgroup.KChipGroup
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.sample.R

class ChipGroupActivityScreen : Screen<ChipGroupActivityScreen>() {
    val chipGroup = KChipGroup { withId(R.id.chip_group) }
    val chipGroup1 = KChipGroup { withId(R.id.chip_group1) }
}
