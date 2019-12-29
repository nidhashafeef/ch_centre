package com.example.chcenter

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chcenter.api.ApiService
import com.example.chcenter.api.model.DoctorModelRequest
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_doctor_details.*

class DoctorDetails : AppCompatActivity() {

    private val apiService by lazy {
        ApiService.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_details)


        btnDoctorDetails.setOnClickListener {

            val strName: String = etName.text.toString()
            val strSpecialisation: String = etSpecialisation.text.toString()
            val strPlace: String = etPlace.text.toString()
            val strContactNumber: String = etContact.text.toString()
            val objRequestDoctorDetails =
                DoctorModelRequest(strName, strSpecialisation, strPlace, strContactNumber)
            Toast.makeText(this, "...............................Saved  ", Toast.LENGTH_SHORT)
                .show()
            apiService.run {
                doctorRegistration(objRequestDoctorDetails)
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


        btnUserList.setOnClickListener {
            apiService.run {
                getAllUserList()
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                        { result ->
                            Log.d(
                                "Successful Dr Register",
                                "response from api ${result.data.get(0)}"
                            )

                        },
                        { error ->
                            Log.e(" Error", "response from api ${error.localizedMessage}")
                        }
                    )
            }
        }

    }
}