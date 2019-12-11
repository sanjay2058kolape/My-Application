package com.sanjay.smarthered

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnshow_toast.setOnClickListener {
            Toast.makeText(this, "button was clicked", Toast.LENGTH_SHORT).show()
        }

        go_to_next_activity.setOnClickListener {
            val message = findViewById<EditText>(R.id.btn_message).text.toString()
            val intent = Intent(this, SecondActivity::class.java)

            intent.putExtra("user_message", message)
            startActivity(intent)
        }


    }
}
