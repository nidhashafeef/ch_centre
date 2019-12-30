package com.example.chcenter.activities


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chcenter.R
import com.example.chcenter.adapters.FreezerAdapter
import com.example.chcenter.api.ApiService
import com.example.chcenter.models.Freezerlist
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_freezers.*

class FreezersActivity : AppCompatActivity() {

    companion object {
        val TAG: String = FreezersActivity::class.java.simpleName
    }

    private val apiService by lazy {
        ApiService.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_freezers)


        setupRecyclerView()


    }

    fun getFreezerList() {
        apiService.run {
            freezerlistview()
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

        val adapter = FreezerAdapter(
            this,
            Freezerlist.Freezers
        )

        recyclerView.adapter = adapter

    }
}

