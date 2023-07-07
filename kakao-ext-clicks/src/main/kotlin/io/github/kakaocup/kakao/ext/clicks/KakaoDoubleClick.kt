package io.github.kakaocup.kakao.ext.clicks

import androidx.test.espresso.action.GeneralLocation
import androidx.test.espresso.action.Press
import io.github.kakaocup.kakao.common.actions.clicks.ClickAction
import io.github.kakaocup.kakao.ext.clicks.inprocess.DoubleClickEvent
import io.github.kakaocup.kakao.ext.clicks.inprocess.InProcessClickAction
import io.github.kakaocup.kakao.ext.clicks.visualization.VisualClicksConfig

class KakaoDoubleClick(private val visualClicksConfig: VisualClicksConfig? = null) : ClickAction {
    override fun click(location: GeneralLocation) = InProcessClickAction(
        clickEvent = DoubleClickEvent(visualClicksConfig),
        coordinatesProvider = location,
        precisionDescriber = Press.FINGER,
        visualClicksConfig = visualClicksConfig
    )
}
