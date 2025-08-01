package com.example.quarterlyalerts

import android.Manifest
import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.widget.*
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {

    private lateinit var alertSwitch: SwitchMaterial
    private lateinit var nextAlertText: TextView
    private lateinit var soundButtons: List<Button>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_FOLLOW_SYSTEM)
        setContentView(R.layout.activity_main)

        alertSwitch = findViewById(R.id.alertSwitch)
        nextAlertText = findViewById(R.id.nextAlertText)
        soundButtons = listOf(
            findViewById(R.id.btnSound15),
            findViewById(R.id.btnSound30),
            findViewById(R.id.btnSound45),
            findViewById(R.id.btnSound00)
        )

        // TODO: wire up logic for switch, textview, and sound pickers
        // TODO: request notification and alarm permissions if necessary
    }
}