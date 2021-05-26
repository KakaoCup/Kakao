package io.github.kakaocup.sample.screen

import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.web.KWebView
import io.github.kakaocup.sample.R

class TestWebScreen : Screen<TestWebScreen>() {
    val webView = KWebView {
        withId(R.id.webView)
    }
}
