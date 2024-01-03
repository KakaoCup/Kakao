package io.github.kakaocup.kakao.common.utilities

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.PluralsRes
import androidx.annotation.StringRes
import androidx.core.content.ContextCompat
import androidx.test.platform.app.InstrumentationRegistry

fun getResourceString(@StringRes resId: Int) =
    InstrumentationRegistry.getInstrumentation().targetContext.resources.getString(resId)

fun getResourceString(@StringRes resId: Int, vararg args: Any) =
    InstrumentationRegistry.getInstrumentation().targetContext.resources.getString(resId, args)

fun getQuantityString(@PluralsRes resId: Int, quantity: Int) =
    InstrumentationRegistry.getInstrumentation().targetContext.resources.getQuantityString(resId, quantity)

fun getResourceDrawable(@DrawableRes resId: Int) =
    ContextCompat.getDrawable(InstrumentationRegistry.getInstrumentation().targetContext, resId)

fun getResourceColor(@ColorRes resId: Int) =
    ContextCompat.getColor(InstrumentationRegistry.getInstrumentation().targetContext, resId)
