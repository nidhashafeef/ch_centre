package com.example.chcenter.adapters



import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.chcenter.FreezerDetails
import com.example.chcenter.MainActivity
import com.example.chcenter.models.FreezerModel
import com.example.chcenter.R
import kotlinx.android.synthetic.main.list_view_freezer.view.*


class FreezerAdapter(val context: Context, private val freezers: List<FreezerModel>) : RecyclerView.Adapter<FreezerAdapter.MyViewHolder>(){

    companion object{
        val TAG: String = MainActivity::class.java.simpleName
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.list_view_freezer, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {


        return freezers.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        val freezer = freezers[position]
        holder.setData(freezer, position)


    }
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        var currenctFreezer: FreezerModel? = null
        var currentPosition: Int = 0
        init {
            itemView.setOnClickListener{
                currenctFreezer?.let{
                    Toast.makeText(context, currenctFreezer!!.Name+"Clicked !",Toast.LENGTH_SHORT).show()
                }

            }

            itemView.imgShare.setOnClickListener {

                currenctFreezer?.let {
                    val message: String = "My hobby is:" + currenctFreezer!!.Name

                    val intent = Intent()
                    intent.action = Intent.ACTION_SEND
                    intent.putExtra(Intent.EXTRA_TEXT,message)
                    intent.type="text/plain"

                    context.startActivity(Intent.createChooser(intent,"Please select app:"))

                }

            }
        }

        fun setData(freezer: FreezerModel?, pos:Int){
            freezer?.let{
                itemView.txvName.text = freezer.Name
            }

            this.currenctFreezer = freezer


        }
    }
}












