package io.github.kakaocup.sample.tools

import io.github.kakaocup.kakao.Kakao
import io.github.kakaocup.kakao.common.actions.clicks.EspressoDoubleClick
import io.github.kakaocup.kakao.common.actions.clicks.EspressoLongClick
import io.github.kakaocup.kakao.common.actions.clicks.EspressoSingleClick
import io.github.kakaocup.kakao.ext.clicks.KakaoDoubleClick
import io.github.kakaocup.kakao.ext.clicks.KakaoLongClick
import io.github.kakaocup.kakao.ext.clicks.KakaoSingleClick
import io.github.kakaocup.kakao.ext.clicks.visualization.VisualClicksConfig

fun applyKakaoClickExtension() {
    Kakao {
        singleClickAction = KakaoSingleClick(VisualClicksConfig())
        doubleClickAction = KakaoDoubleClick(VisualClicksConfig())
        longClickAction = KakaoLongClick(VisualClicksConfig())
    }
}

fun applyEspressoClickExtension() {
    Kakao {
        singleClickAction = EspressoSingleClick()
        doubleClickAction = EspressoDoubleClick()
        longClickAction = EspressoLongClick()
    }
}
