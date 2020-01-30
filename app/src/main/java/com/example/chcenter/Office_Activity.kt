package com.example.chcenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ambulances.*
import kotlinx.android.synthetic.main.activity_office_.*

class Office_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_)

        setSupportActionBar(toolbar8)

        getSupportActionBar()!!.setTitle("OfficeDetails")
        getSupportActionBar()!!.setDefaultDisplayHomeAsUpEnabled(true);
        supportActionBar?.setDisplayHomeAsUpEnabled(true)




    }
}
