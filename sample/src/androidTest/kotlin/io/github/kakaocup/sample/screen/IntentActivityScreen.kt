package io.github.kakaocup.sample.screen

import android.app.Activity
import android.content.Intent
import io.github.kakaocup.kakao.intent.KIntent
import io.github.kakaocup.kakao.screen.Screen
import io.github.kakaocup.kakao.text.KButton
import io.github.kakaocup.kakao.text.KTextView
import io.github.kakaocup.sample.R

class IntentActivityScreen : Screen<IntentActivityScreen>() {
    val resultText = KTextView { withId(R.id.result_text) }
    val startActivityButton = KButton { withId(R.id.intent_button) }
    val startActivityForResultButton = KButton { withId(R.id.intent_result_button) }

    val normalIntent = KIntent {
        hasAction("ACTION_TEST")
        hasCategories("TEST")
        hasFlag(Intent.FLAG_ACTIVITY_NO_ANIMATION)
        hasExtra("test", "test")
    }

    val okResultIntent = KIntent {
        hasAction("ACTION_TEST_RESULT")
        hasCategories("TEST_RESULT")
        hasFlag(Intent.FLAG_ACTIVITY_NO_ANIMATION)

        hasExtras {
            hasEntry("test", "test")
            hasEntry("test2", "test2")
        }

        withResult {
            withCode(Activity.RESULT_OK)
            withData(Intent().apply { putExtra("text", "SUCCESS") })
        }
    }

    val errorResultIntent = KIntent {
        hasAction("ACTION_TEST_RESULT")
        hasCategories("TEST_RESULT")
        hasFlag(Intent.FLAG_ACTIVITY_NO_ANIMATION)

        hasExtras {
            hasEntry("test", "test")
            hasEntry("test2", "test2")
        }

        withResult {
            withCode(Activity.RESULT_CANCELED)
        }
    }
}
