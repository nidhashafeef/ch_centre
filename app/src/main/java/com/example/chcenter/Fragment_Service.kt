package com.example.chcenter

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_ambulance_details.*
import kotlinx.android.synthetic.main.activity_donation.*
import kotlinx.android.synthetic.main.fragment_service.*


class Fragment_Service : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?



    ): View? {
        return inflater.inflate(R.layout.fragment_service, null)
        imageView3.setOnClickListener {
            val intent =  Intent(activity, AmbulDetails::class.java)
            startActivity(intent)
        }

        imageView9.setOnClickListener {
            val intent = Intent(activity, DoctorDetails::class.java)
            startActivity(intent)
        }

        imageView7.setOnClickListener {
            val intent = Intent(activity, VolunteerDetails::class.java)
            startActivity(intent)
        }

    }


}

