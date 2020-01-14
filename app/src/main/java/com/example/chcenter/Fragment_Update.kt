package com.example.chcenter

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

class Fragment_Update : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_update, null)


    }




}
