package com.zestworks.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class ActivityB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle event", "ActivityB: onCreate")
        setContentView(R.layout.activity_b)
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle event", "ActivityB: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle event", "ActivityB: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle event", "ActivityB: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle event", "ActivityB: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle event", "ActivityB: onDestroy")
    }
}
