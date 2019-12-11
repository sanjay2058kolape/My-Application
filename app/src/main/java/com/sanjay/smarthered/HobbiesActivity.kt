package com.sanjay.smarthered

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.sanjay.smarthered.adapter.HobbiesAdapter
import com.sanjay.smarthered.models.Supplier
import kotlinx.android.synthetic.main.activity_hobbies.*

class HobbiesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
          recycler_view.layoutManager=layoutManager
        val adapter = HobbiesAdapter(this, Supplier.hobbies)

        recycler_view.adapter = adapter
    }

}