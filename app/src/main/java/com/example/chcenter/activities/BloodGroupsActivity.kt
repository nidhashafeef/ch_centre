package com.example.chcenter.activities


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chcenter.R
import com.example.chcenter.adapters.BloodGroupAdapter
import com.example.chcenter.api.ApiService
import com.example.chcenter.models.Bloodgrouplist
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_blood_groups.*

class BloodGroupsActivity : AppCompatActivity() {

    companion object {
        val TAG: String = BloodGroupsActivity::class.java.simpleName
    }

    private val apiService by lazy {
        ApiService.create()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blood_groups)


        setupRecyclerView()


    }

    fun getBloodgroupsList() {
        apiService.run {
            bloodgrouplistview()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    { result ->
                        Log.d("Successful Dr Register", "response from api ${result}")

                    },
                    { error ->

                        Log.e(" Error", "response from api ${error.localizedMessage}")
                    }
                )
        }
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

