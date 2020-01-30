package com.example.chcenter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ambulances.*
import kotlinx.android.synthetic.main.activity_on_cash.*

class OnCashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_cash)

        setSupportActionBar(toolbar6)

        getSupportActionBar()!!.setTitle("OnCash")
        getSupportActionBar()!!.setDefaultDisplayHomeAsUpEnabled(true);
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}
