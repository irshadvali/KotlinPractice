package com.irshad.kotlinpractice.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.irshad.kotlinpractice.R
import com.irshad.kotlinpractice.model.Company

/**
 * Created by irshadvali on 27/10/17.
 */
class CompanyListAdapter(val companyList: ArrayList<Company>) : RecyclerView.Adapter<CompanyListAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompanyListAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CompanyListAdapter.ViewHolder, position: Int) {
        holder.bindItems(companyList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return companyList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(company: Company) {
            val companyName = itemView.findViewById(R.id.tvCompanyName) as TextView
            val companyLocation  = itemView.findViewById(R.id.tvLocation) as TextView
            companyName.text = company.cname
            companyLocation.text = company.clocation
        }
    }
}