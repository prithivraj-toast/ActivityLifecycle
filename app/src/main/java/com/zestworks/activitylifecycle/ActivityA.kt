package com.zestworks.activitylifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_a.*

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Lifecycle event", "ActivityA: onCreate")
        setContentView(R.layout.activity_a)
        startSecond.setOnClickListener {
            val intent = Intent(this, ActivityB::class.java)
            startActivity(intent)
            Log.d("Lifecycle event", "ActivityA: code after launching new activity")
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle event", "ActivityA: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle event", "ActivityA: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Lifecycle event", "ActivityA: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle event", "ActivityA: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle event", "ActivityA: onDestroy")
    }
}
