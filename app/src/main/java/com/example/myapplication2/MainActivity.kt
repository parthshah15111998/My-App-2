package com.example.myapplication2

import android.content.BroadcastReceiver
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btn_start)
            .setOnClickListener {
                Toast.makeText(this, "Start Services", Toast.LENGTH_LONG).show()
                startService(Intent(this, MyServices::class.java))
            }

        findViewById<Button>(R.id.btn_stop)
            .setOnClickListener {
                Toast.makeText(this, "Stop Services", Toast.LENGTH_LONG).show()
                stopService(Intent(this, MyServices::class.java))
            }
    }
}