package com.example.chcenter.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chcenter.R
import com.example.chcenter.adapters.AdapterMain
import com.example.chcenter.models.ModelMainData
import com.example.chcenter.models.ModelNestedData
import kotlinx.android.synthetic.main.activity_morning_docters.*


class MorningDocters : AppCompatActivity() {

    var arrayList = ArrayList<ModelMainData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        recycler_main.adapter = AdapterMain(this,arrayList){ mainIndex,innerIndex->

            Toast.makeText(this,arrayList[mainIndex].mainHeading + " " + arrayList[mainIndex].dataList[innerIndex].title,Toast.LENGTH_LONG).show()

        }


    }

    //init list with data
    private fun initData() {

        for (i in 0..4){ // data for main recycler

            val mainHeading = "Heading $i"

            val innerArray = ArrayList<ModelNestedData>()

            for (j in 0..4) { // data for inner recycler
                innerArray.add(ModelNestedData("Title $j", "Message $j"))
            }
            arrayList.add(ModelMainData(mainHeading,innerArray))

        }

    }
}
