package io.github.kakaocup.sample

import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GestureDetectorCompat

class ButtonDoubleClickActivity : AppCompatActivity() {
    private val button: Button by lazy { findViewById(R.id.button) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button_double_clicks)
        val detector = GestureDetectorCompat(this, StubGestureListener())
        detector.setOnDoubleTapListener(DoubleClickListener(doOnDoubleClick = {
            button.text = "Double click registered"
        }))
        button.setOnTouchListener { v, event ->
            detector.onTouchEvent(event)
        }
    }

    private class DoubleClickListener(private val doOnDoubleClick: () -> Unit) : GestureDetector.OnDoubleTapListener {
        override fun onSingleTapConfirmed(e: MotionEvent): Boolean {
            return true
        }

        override fun onDoubleTap(e: MotionEvent): Boolean {
            return true
        }

        override fun onDoubleTapEvent(e: MotionEvent): Boolean {
            doOnDoubleClick.invoke()
            return true
        }
    }

    private class StubGestureListener : GestureDetector.OnGestureListener {
        override fun onDown(e: MotionEvent): Boolean {
            return true
        }

        override fun onShowPress(e: MotionEvent) {
            // do nothing
        }

        override fun onSingleTapUp(e: MotionEvent): Boolean {
            return true
        }

        override fun onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Float, distanceY: Float): Boolean {
            return true
        }

        override fun onLongPress(e: MotionEvent) {
            // do nothing
        }

        override fun onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Float, velocityY: Float): Boolean {
            return true
        }
    }
}
