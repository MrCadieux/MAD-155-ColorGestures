package com.example.gestures3

import android.accessibilityservice.AccessibilityService
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.text.style.BackgroundColorSpan
import android.view.GestureDetector
import android.view.LayoutInflater
import android.view.MotionEvent
import android.widget.LinearLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.view.GestureDetectorCompat

class MainActivity : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    var gDetector: GestureDetectorCompat? = null
    var gText: TextView? = null
    var myView: LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myView = findViewById(R.id.background)
        gText = findViewById(R.id.gestureText)
        this.gDetector = GestureDetectorCompat(this,this)
        gDetector?.setOnDoubleTapListener(this)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        this.gDetector?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }

    override fun onDown(e: MotionEvent?): Boolean {
        gText?.text = "onDown"
        myView?.setBackgroundResource(R.color.red)
        return true
    }

    override fun onShowPress(e: MotionEvent?) {
        gText?.text = "onShowPress"
        myView?.setBackgroundResource(R.color.orange)
    }

    override fun onSingleTapUp(e: MotionEvent?): Boolean {
        gText?.text = "onSingleTapUp"
        myView?.setBackgroundResource(R.color.yellow)
        return true
    }

    override fun onScroll(
        e1: MotionEvent?,
        e2: MotionEvent?,
        distanceX: Float,
        distanceY: Float
    ): Boolean {
        gText?.text = "onScroll"
        myView?.setBackgroundResource(R.color.green)
        return true
    }

    override fun onLongPress(e: MotionEvent?) {
        gText?.text = "onLongPress"
        myView?.setBackgroundResource(R.color.blue)
    }

    override fun onFling(
        e1: MotionEvent?,
        e2: MotionEvent?,
        velocityX: Float,
        velocityY: Float
    ): Boolean {
        gText?.text = "onFling"
        myView?.setBackgroundResource(R.color.indigo)
        return true
    }

    override fun onSingleTapConfirmed(e: MotionEvent?): Boolean {
        gText?.text = "onSingleTapConfirmed"
        myView?.setBackgroundResource(R.color.yellow)
        return true
    }

    override fun onDoubleTap(e: MotionEvent?): Boolean {
        gText?.text = "onDoubleTap"
        myView?.setBackgroundResource(R.color.red)
        return true
    }

    override fun onDoubleTapEvent(e: MotionEvent?): Boolean {
        gText?.text = "onDoubleTapEvent"
        myView?.setBackgroundResource(R.color.red)
        return true
    }
}