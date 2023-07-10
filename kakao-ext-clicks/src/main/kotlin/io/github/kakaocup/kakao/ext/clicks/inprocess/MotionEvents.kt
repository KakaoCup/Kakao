package io.github.kakaocup.kakao.ext.clicks.inprocess

import android.os.SystemClock
import android.view.InputDevice
import android.view.MotionEvent

internal object MotionEvents {

    private const val NORMAL_PRESSURE = 1F
    private const val NORMAL_SIZE = 1F
    private const val WITHOUT_MODIFIERS_META_STATE = 0

    fun downEvent(coordinates: FloatArray, precision: FloatArray): MotionEvent = obtainEvent(
        coordinates = coordinates,
        precision = precision,
        event = MotionEvent.ACTION_DOWN,
    )

    fun upEvent(down: MotionEvent): MotionEvent = MotionEvent.obtain(
        down.downTime,
        provideTime(),
        MotionEvent.ACTION_UP,
        down.x,
        down.y,
        down.pressure,
        down.size,
        down.metaState,
        down.xPrecision,
        down.yPrecision,
        down.deviceId,
        down.edgeFlags
    )

    private fun provideTime(): Long = SystemClock.uptimeMillis()

    private fun obtainEvent(coordinates: FloatArray, precision: FloatArray, event: Int): MotionEvent = MotionEvent.obtain(
        provideTime(),
        provideTime(),
        event,
        coordinates[0],
        coordinates[1],
        NORMAL_PRESSURE,
        NORMAL_SIZE,
        WITHOUT_MODIFIERS_META_STATE,
        precision[0],
        precision[1],
        InputDevice.SOURCE_UNKNOWN,
        0
    )
}
