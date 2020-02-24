package com.example.chcenter

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.chcenter.api.ApiService
import com.example.chcenter.api.model.VolunteerModelRequest
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_volunteer.*

class VolunteerDetails : AppCompatActivity() {

    private val apiService by lazy {
        ApiService.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volunteer)

        setSupportActionBar(toolbar15)

        getSupportActionBar()!!.setTitle("Volunteer Registration")
        getSupportActionBar()!!.setDefaultDisplayHomeAsUpEnabled(true);
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        btnVolunteer.setOnClickListener {
            val strVolunteerName: String = etVolunteerName.text.toString()
            val strVolunteerAge: String = etVolunteerAge.text.toString()
            val strVolunteerPlace: String = etVolunteerPlace.text.toString()
            val strVolunteerContact: String = etVolunteerContact.text.toString()
            val objRequestVolunteerDetails = VolunteerModelRequest(
                strVolunteerName,
                strVolunteerAge,
                strVolunteerPlace,
                strVolunteerContact
            )

            apiService.run {
                volunteerRegistration(objRequestVolunteerDetails)
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
    }
}