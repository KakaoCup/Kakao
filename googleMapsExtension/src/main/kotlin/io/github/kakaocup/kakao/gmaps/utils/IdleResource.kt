package io.github.kakaocup.kakao.gmaps.utils

import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.idling.CountingIdlingResource
import kotlin.random.Random

class IdleResource {
    private val countingIdlingResource = CountingIdlingResource("IdleResource: ${Random.nextInt()}")
    fun idle(function: IdleResource.() -> Any) {
        IdlingRegistry.getInstance().register(countingIdlingResource)
        countingIdlingResource.increment()
        function.invoke(this)
    }

    fun release() {
        countingIdlingResource.decrement()
        IdlingRegistry.getInstance().unregister(countingIdlingResource)
    }

    companion object {
        fun idle(function: IdleResource.() -> Any) {
            IdleResource().idle(function)
        }
    }
}
