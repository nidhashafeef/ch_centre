package com.example.chcenter.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chcenter.R
import com.example.chcenter.adapters.VolunteerAdapter
import com.example.chcenter.models.Volunteerlist
import kotlinx.android.synthetic.main.activity_volunteers.*

class VolunteersActivity : AppCompatActivity() {

    companion object {
        val TAG: String = VolunteersActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volunteers)


        setupRecyclerView()


    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)

        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager


        val adapter = VolunteerAdapter(
            this,
            Volunteerlist.volunteers
        )

        recyclerView.adapter = adapter

    }
}

