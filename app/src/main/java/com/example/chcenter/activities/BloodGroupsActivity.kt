package com.example.chcenter.activities


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chcenter.R
import com.example.chcenter.adapters.BloodGroupAdapter
import com.example.chcenter.models.Bloodgrouplist
import kotlinx.android.synthetic.main.activity_blood_groups.*

class BloodGroupsActivity : AppCompatActivity() {

    companion object {
        val TAG: String = BloodGroupsActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blood_groups)


        setupRecyclerView()


    }

    private fun setupRecyclerView() {
        val layoutManager = LinearLayoutManager(this)

        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = BloodGroupAdapter(
            this,
            Bloodgrouplist.Bloodgroups
        )

        recyclerView.adapter = adapter

    }
}

