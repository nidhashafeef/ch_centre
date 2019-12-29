package com.example.chcenter.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chcenter.R
import com.example.chcenter.adapters.DoctorAdapter
import com.example.chcenter.models.Doctorlist
import kotlinx.android.synthetic.main.activity_doctors.*

class DoctorsActivity : AppCompatActivity() {

    companion object {
        val TAG: String = DoctorsActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctors)


        setupRecyclerView()


    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)

        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = DoctorAdapter(
            this, Doctorlist.Doctors
        )

        recyclerView.adapter = adapter

    }
}

