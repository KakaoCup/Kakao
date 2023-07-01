package io.github.kakaocup.kakao.ext.clicks

import io.github.kakaocup.kakao.Kakao
import io.github.kakaocup.kakao.ext.clicks.visualization.VisualClicksConfig
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class KakaoClicksTestRule(private val visualClicksConfig: VisualClicksConfig? = VisualClicksConfig()) : TestRule {
    override fun apply(base: Statement, description: Description) = object : Statement() {
        override fun evaluate() {
            val oldSingleClickAction = Kakao.singleClickAction
            val oldDoubleClickAction = Kakao.doubleClickAction
            val oldLongClickAction = Kakao.longClickAction

            Kakao.singleClickAction = KakaoSingleClick(visualClicksConfig)
            Kakao.doubleClickAction = KakaoDoubleClick(visualClicksConfig)
            Kakao.longClickAction = KakaoLongClick(visualClicksConfig)

            base.evaluate()

            Kakao.singleClickAction = oldSingleClickAction
            Kakao.doubleClickAction = oldDoubleClickAction
            Kakao.longClickAction = oldLongClickAction
        }
    }
}
