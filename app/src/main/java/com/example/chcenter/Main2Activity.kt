package com.example.chcenter

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuItem
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity

import com.example.chcenter.ui.main.SectionsPagerAdapter



class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.fragment_container)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.example_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            R.id.item_office->{

               // val  intent= Intent(this,Office::class.java)
                val  intent= Intent(this, Office_Activity::class.java)
                startActivity(intent)
            }
            R.id.item_history->{
                val  intent= Intent(this, History_Activity::class.java)
                startActivity(intent)


            }
            R.id.item_profile->{
                val  intent= Intent(this, Profile_Activity::class.java)
                startActivity(intent)

            }

        }
        return super.onOptionsItemSelected(item)
    }

}

