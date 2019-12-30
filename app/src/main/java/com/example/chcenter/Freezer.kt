package com.example.chcenter

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chcenter.api.ApiService
import com.example.chcenter.api.model.FreezerRequest
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_freezer_details.*

class Freezer : AppCompatActivity() {
    private val apiService by lazy {
        ApiService.create()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_details)

        btndone.setOnClickListener {

            val strNameFreezer: String = etEnterName.text.toString()
            val strPhoneNumber: String = etPhoneNumber.text.toString()
            val objFreezer = FreezerRequest(strNameFreezer, strPhoneNumber)
            Toast.makeText(this, "Saved  ", Toast.LENGTH_SHORT).show()
            apiService.run {
                freezer(objFreezer)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                        { result ->
                            Log.d("Successfully Registered", "response from api ${result}")

                        },
                        { error ->
                            Log.e(" Error", "response from api ${error.localizedMessage}")
                        }
                    )
            }
        }

    }

}