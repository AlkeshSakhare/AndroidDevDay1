package com.example.myandroidapp

import android.annotation.SuppressLint
import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : Activity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var textView = findViewById<TextView>(R.id.tvOffer)
        var username = intent.getStringExtra("username")
        textView.text = "$username , you will get free access to content for a month"
    }
}