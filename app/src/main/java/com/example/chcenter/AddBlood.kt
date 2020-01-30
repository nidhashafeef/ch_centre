package com.example.chcenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_add_blood.*
import kotlinx.android.synthetic.main.activity_doctors.*

class AddBlood : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_blood)

        setSupportActionBar(toolbar12)
        getSupportActionBar()!!.setTitle("AddBlood")
        getSupportActionBar()!!.setDefaultDisplayHomeAsUpEnabled(true);
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}
