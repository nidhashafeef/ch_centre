package com.example.chcenter.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chcenter.adapters.AmbulanceAdapter
import com.example.chcenter.R
import com.example.chcenter.models.Ambulancelist
import kotlinx.android.synthetic.main.activity_ambulances.*

class AmbulancesActivity : AppCompatActivity(){

    companion object{
        val TAG: String = AmbulancesActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ambulances)


        setupRecyclerView()




    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this )

        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager


        val adapter=AmbulanceAdapter(
            this,
            Ambulancelist.Ambulances
        )

        recyclerView.adapter = adapter

    }
}

