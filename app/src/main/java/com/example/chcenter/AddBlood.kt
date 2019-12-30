package com.example.chcenter

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.chcenter.api.ApiService
import com.example.chcenter.api.model.AddBloodRequest
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_add_blood.*

class AddBlood : AppCompatActivity() {

    private val apiService by lazy {
        ApiService.create()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_blood)

        btnAddBlood.setOnClickListener {

            val strname: String = txtname.text.toString()
            val strage: String = txtage.text.toString()
            val strbloodgroup: String = txtbloodgroup.text.toString()
            val strlastdonate: String = txtdate.text.toString()
            val strcontact: String = txtbloodgroup.text.toString()
            val objRequestAddBlood =
                AddBloodRequest(strname, strage, strbloodgroup, strlastdonate, strcontact)
            Toast.makeText(this, "Saved  ", Toast.LENGTH_SHORT)
                .show()
            apiService.run {
                addBlood(objRequestAddBlood)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe(
                        { result ->
                            Log.d("Successfully result", "response from api ${result}")

                        },
                        { error ->
                            Log.e("Error", "response from api ${error.localizedMessage}")
                        }
                    )
            }

        }

    }
}
