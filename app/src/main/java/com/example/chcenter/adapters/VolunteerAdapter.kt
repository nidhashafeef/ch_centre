package com.example.chcenter.adapters


import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.chcenter.R
import com.example.chcenter.activities.MainActivity
import com.example.chcenter.models.VolunteerModel
import kotlinx.android.synthetic.main.list_view_volunteers.view.*


class VolunteerAdapter(
    val context: Context,
    private val volunteers: List<VolunteerModel>
) : RecyclerView.Adapter<VolunteerAdapter.MyViewHolder>() {

    companion object {
        val TAG: String = MainActivity::class.java.simpleName
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view =
            LayoutInflater.from(context).inflate(R.layout.list_view_volunteers, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {


        return volunteers.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val volunteer = volunteers[position]
        holder.setData(volunteer, position)


    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var currenctVolunteer: VolunteerModel? = null
        var currentPosition: Int = 0

        init {
            itemView.setOnClickListener {
                currenctVolunteer?.let {
                    Toast.makeText(
                        context,
                        currenctVolunteer!!.Name + "Clicked !",
                        Toast.LENGTH_SHORT
                    ).show()
                }


            }



            itemView.imgShare.setOnClickListener {

                currenctVolunteer?.let {
                    val message: String =
                        "My hobby is:" + currenctVolunteer!!.Name + " " + currenctVolunteer!!.Phoneno

                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT, message)
                    intent.type = "text/plain"

                    context.startActivity(Intent.createChooser(intent, "Please select app:"))

                }

            }
        }


        fun setData(volunteer: VolunteerModel?, pos: Int) {
            volunteer?.let {

                itemView.txvContact.text = volunteer?.Phoneno
                itemView.txvName.text = volunteer?.Name
            }

            this.currenctVolunteer = volunteer


        }
    }
}












