package com.example.chcenter

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_donation.*

class DonationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donation)
        imagefood.setOnClickListener {
            val intent = Intent(this, FoodActivity::class.java)
            startActivity(intent)
        }


        imagepayment.setOnClickListener {
            val intent = Intent(this, OnCashActivity::class.java)
            startActivity(intent)
        }
    }
}
