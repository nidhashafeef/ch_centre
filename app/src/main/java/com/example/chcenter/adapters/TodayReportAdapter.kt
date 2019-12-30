package com.example.chcenter.adapters


import android.content.Context
import com.example.chcenter.api.model.TodayReport


class TodayReportAdapter(val context: Context, private val reports: List<TodayReport>) {


//    RecyclerView.Adapter<TodayReportAdapter.MyViewHolder>() {
//
//    companion object {
//        val TAG: String = MainActivity::class.java.simpleName
//    }
//
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
//
//        val view = LayoutInflater.from(context).inflate(R.layout.list_view_freezer, parent, false)
//        return MyViewHolder(view)
//
//    }
//
//    override fun getItemCount(): Int {
//
//
//        return reports.size
//
//    }
//
//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//
//        val report = reports[position]
//        holder.setData(report, position)
//
//
//    }
//
//    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
//
//        var currentReports: TodayReport? = null
//        var currentReports: Int = 0
//
//        init {
//            itemView.setOnClickListener {
//                currentReports?.let {
//                    Toast.makeText(
//                        context,
//                        currentReports!!.Name + "Clicked !",
//                        Toast.LENGTH_SHORT
//                    ).show()
//
//
//
//
//                }
//
//            }
//        }
//
//        fun setData(reports: List<TodayReport>: TodayReport, pos: Int) {
//            reports?.let {
//
//                itemView.txvContact.text = reports?.Phoneno
//                itemView.txvName.text = reports?.Name
//            }
//
//            this.currentReports = reports
//
//
//        }
//    }
}












