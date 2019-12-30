package com.example.chcenter

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment

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


    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.example_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_office -> {

                // val  intent= Intent(this,Office::class.java)
                val intent = Intent(activity, Office_Activity::class.java)
                startActivity(intent)
            }
            R.id.item_history -> {
                val intent = Intent(activity, History_Activity::class.java)
                startActivity(intent)


            }
            R.id.item_profile -> {
                val intent = Intent(activity, Profile_Activity::class.java)
                startActivity(intent)

            }
        }
        return super.onOptionsItemSelected(item)
    }
}
