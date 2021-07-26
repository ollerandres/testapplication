package com.ollerandres.testapplication.recycling

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ollerandres.testapplication.recycling.ui.main.RecyclingFragment

class RecyclingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycling_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, RecyclingFragment.newInstance())
                .commitNow()
        }
    }
}