package com.example.chcenter

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chcenter.api.ApiService
import com.example.chcenter.api.model.Request
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_ambulance__registration.*
import kotlinx.android.synthetic.main.activity_donation.*

class Ambulance_Registration : AppCompatActivity() {

    private val apiService by lazy {
        ApiService.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ambulance__registration)

        setSupportActionBar(toolbar16)

        getSupportActionBar()!!.setTitle("Donations")
        getSupportActionBar()!!.setDefaultDisplayHomeAsUpEnabled(true);
        supportActionBar?.setDisplayHomeAsUpEnabled(true)



        btnSave.setOnClickListener {

            val strName: String = editName.text.toString()
            val strjob: String = etJob.text.toString()
            val objRequestUserData = Request(strName, strjob)
            Toast.makeText(this, "...............................Saved  ", Toast.LENGTH_SHORT)
                .show()
            apiService.run {
                userRegistration(objRequestUserData)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                        { result ->
                            Log.d("Successfully result", "response from api ${result}")

                        },
                        { error ->
                            Log.e("ZQQQ Error", "response from api ${error.localizedMessage}")
                        }
                    )
            }

        }

    }

}
