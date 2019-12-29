package com.example.chcenter.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chcenter.adapters.FreezerAdapter
import com.example.chcenter.R
import com.example.chcenter.models.Freezerlist
import kotlinx.android.synthetic.main.activity_freezers.*

class FreezersActivity : AppCompatActivity(){

    companion object{
        val TAG: String = FreezersActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_freezers)


        setupRecyclerView()




    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this )

        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter= FreezerAdapter(
            this,
            Freezerlist.Freezers
        )

        recyclerView.adapter = adapter

    }
}

