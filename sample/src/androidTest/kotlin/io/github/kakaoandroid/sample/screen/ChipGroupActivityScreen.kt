package io.github.kakaoandroid.sample.screen

import io.github.kakaoandroid.kakao.chipgroup.KChipGroup
import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.sample.R

class ChipGroupActivityScreen : Screen<ChipGroupActivityScreen>() {
    val chipGroup = KChipGroup { withId(R.id.chip_group) }
    val chipGroup1 = KChipGroup { withId(R.id.chip_group1) }
}
