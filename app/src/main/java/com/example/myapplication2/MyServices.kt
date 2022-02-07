package com.example.myapplication2

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log

class MyServices: Service() {
    override fun onBind(p0: Intent?): IBinder? {
        printLog("onBind")
        return null
    }

    override fun onCreate() {
        super.onCreate()
        printLog("onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        printLog("onStart")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        super.onDestroy()
        printLog("onDestroy")
    }

    private fun printLog(message:String) {
        Log.e("TAG",message)
    }
}