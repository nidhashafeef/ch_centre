package com.example.chcenter.activities


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chcenter.R
import com.example.chcenter.adapters.VolunteerAdapter
import com.example.chcenter.api.ApiService
import com.example.chcenter.models.Volunteerlist
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_volunteers.*

class VolunteersActivity : AppCompatActivity() {

    companion object {
        val TAG: String = VolunteersActivity::class.java.simpleName
    }

    private val apiService by lazy {
        ApiService.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volunteers)


        setupRecyclerView()


    }

    fun getVolunteerList() {
        apiService.run {
            volunteerlistview()
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


        val adapter = VolunteerAdapter(
            this,
            Volunteerlist.volunteers
        )

        recyclerView.adapter = adapter

    }
}

