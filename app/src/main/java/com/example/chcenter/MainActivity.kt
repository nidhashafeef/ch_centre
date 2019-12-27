package com.example.chcenter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_freezers)


        button3.setOnClickListener {
            val intent = Intent(this,FreezersActivity::class.java)
            startActivity(intent)
        }
    }
}
