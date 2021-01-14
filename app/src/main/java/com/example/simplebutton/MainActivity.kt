package com.example.simplebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity()
    {
        private val btnSimple : Button by lazy { findViewById(R.id.simpleButtonID) }
        private val TAG = "MyActivity"
        private var clickcounter = 0

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSimple.setOnClickListener {
            clickcounter++
            Log.i(TAG, "SimpleButton wurde $clickcounter mal gedrückt")
            if(clickcounter ==1) btnSimple.text = getString(R.string.SimpleButton2)
        }
    }
}
