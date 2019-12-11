package com.sanjay.smarthered

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import java.time.Instant

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        val bundle:Bundle?=intent.extras
        val msg= bundle?.getString("user_message")

        coming_msg.append(msg)

        msg_share_to_other_app.setOnClickListener {
            val intent=Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,msg)
            intent.type="text/plain"

            startActivity(Intent.createChooser(intent,"Share To :"))
        }

        recycler_view_demo.setOnClickListener {
            val intent=Intent(this,HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}