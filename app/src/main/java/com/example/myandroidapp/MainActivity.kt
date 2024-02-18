package com.example.myandroidapp

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {


    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val greetMsg = findViewById<TextView>(R.id.tvGreet)
        val nameInputText = findViewById<EditText>(R.id.etName)
        val submitBtn = findViewById<Button>(R.id.btnSubmit)
        val viewOfferBtn = findViewById<Button>(R.id.btnViewOffers)
        var name = ""
        submitBtn.setOnClickListener {
            name = nameInputText.text.toString()
            if (name == "") {
                viewOfferBtn.visibility = View.INVISIBLE
                greetMsg.text = getString(R.string.welcome_to_android_development)
                Toast.makeText(this@MainActivity, "Enter your name", Toast.LENGTH_LONG)
                    .show()
            } else {
                greetMsg.text = getString(R.string.welcome_to_android_development) + " " + name
                nameInputText.text.clear()
                viewOfferBtn.visibility = View.VISIBLE
            }
            viewOfferBtn.setOnClickListener {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("username", name)
                startActivity(intent)
            }
        }
    }


}
