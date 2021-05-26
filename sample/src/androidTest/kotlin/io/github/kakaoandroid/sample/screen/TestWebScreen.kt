package io.github.kakaoandroid.sample.screen

import io.github.kakaoandroid.kakao.screen.Screen
import io.github.kakaoandroid.kakao.web.KWebView
import io.github.kakaoandroid.sample.R

class TestWebScreen : Screen<TestWebScreen>() {
    val webView = KWebView {
        withId(R.id.webView)
    }
}
