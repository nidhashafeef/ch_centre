package com.example.chcenter.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.chcenter.R
import com.example.chcenter.activities.MainActivity
import com.example.chcenter.models.DoctorModel
import kotlinx.android.synthetic.main.list_view_docter.view.*


class DoctorAdapter(val context: Context, private val docters: List<DoctorModel>) :
    RecyclerView.Adapter<DoctorAdapter.MyViewHolder>() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.list_view_docter, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {


        return docters.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val docter = docters[position]
        holder.setData(docter, position)


    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currenctDoctor: DoctorModel? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {


                currenctDoctor?.let {
                    Toast.makeText(context, currenctDoctor!!.Name + "Clicked !", Toast.LENGTH_SHORT)
                        .show()


                }

            }
        }

        fun setData(docter: DoctorModel?, pos: Int) {
            docter?.let {

                itemView.txvContact.text = docter?.Phoneno
                itemView.txvName.text = docter?.Name
                itemView.txvSepecialization.text = docter?.Sepacialization
                itemView.txvPlace.text = docter?.Place
            }

            this.currenctDoctor = docter


        }
    }
}












