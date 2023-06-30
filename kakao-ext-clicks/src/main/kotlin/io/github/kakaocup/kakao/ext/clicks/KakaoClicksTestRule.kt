package io.github.kakaocup.kakao.ext.clicks

import io.github.kakaocup.kakao.Kakao
import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

class KakaoClicksTestRule : TestRule {
    override fun apply(base: Statement, description: Description) = object : Statement() {
        override fun evaluate() {
            val oldSingleClickAction = Kakao.singleClickAction
            val oldDoubleClickAction = Kakao.doubleClickAction
            val oldLongClickAction = Kakao.longClickAction

            Kakao.singleClickAction = KakaoSingleClick()
            Kakao.doubleClickAction = KakaoDoubleClick()
            Kakao.longClickAction = KakaoLongClick()

            base.evaluate()

            Kakao.singleClickAction = oldSingleClickAction
            Kakao.doubleClickAction = oldDoubleClickAction
            Kakao.longClickAction = oldLongClickAction
        }
    }
}