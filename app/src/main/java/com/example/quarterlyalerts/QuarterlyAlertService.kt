package com.example.quarterlyalerts

import android.app.Service
import android.content.Intent
import android.os.IBinder
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat

class QuarterlyAlertService : Service() {
    override fun onCreate() {
        super.onCreate()
        // TODO: start foreground with notification for media playback
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        // TODO: schedule next alert, manage playback
        return START_STICKY
    }

    override fun onDestroy() {
        super.onDestroy()
        // TODO: cleanup
    }

    override fun onBind(intent: Intent?): IBinder? = null
}