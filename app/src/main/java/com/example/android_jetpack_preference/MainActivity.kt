package com.example.android_jetpack_preference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sp = PreferenceManager.getDefaultSharedPreferences(this)

        sp.edit()
            .clear()
            .apply()

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.root, SettingsFragment())
            .commit()
    }
}