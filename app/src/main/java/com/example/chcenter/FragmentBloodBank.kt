package com.example.chcenter

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_bloodbank.*

class FragmentBloodBank : Fragment(), AdapterView.OnItemSelectedListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bloodbank, null)
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


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ArrayAdapter.createFromResource(activity, R.array.bloodgroups, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this
    }

    override fun onItemSelected(
        parent: AdapterView<*>, view: View, position

        : Int, l: Long
    ) {
        val text = parent.getItemAtPosition(position).toString()
        Toast.makeText(parent.context, text, Toast.LENGTH_SHORT).show()


    }

    override fun onNothingSelected(adapterView: AdapterView<*>) {

    }
}