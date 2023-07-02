package io.github.kakaocup.kakao.ext.clicks.testrule

import io.github.kakaocup.kakao.Kakao
import io.github.kakaocup.kakao.ext.clicks.KakaoDoubleClick
import io.github.kakaocup.kakao.ext.clicks.KakaoLongClick
import io.github.kakaocup.kakao.ext.clicks.KakaoSingleClick
import io.github.kakaocup.kakao.ext.clicks.visualization.VisualClicksConfig
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class KakaoClicksTestRule(private val visualClicksConfig: VisualClicksConfig? = null) : TestRule {
    override fun apply(base: Statement, description: Description) = object : Statement() {
        override fun evaluate() {

            val oldSingleClickAction = Kakao.singleClickAction
            val oldDoubleClickAction = Kakao.doubleClickAction
            val oldLongClickAction = Kakao.longClickAction

            val visualClicksConfig = description.getAnnotation(WithVisualClicks::class.java)
                ?.let { VisualClicksConfig(it.touchRadius, it.color) }
                ?: visualClicksConfig

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
