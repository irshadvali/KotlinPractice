package com.irshad.kotlinpractice.uiactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.irshad.kotlinpractice.R
import com.irshad.kotlinpractice.adapter.CompanyListAdapter
import com.irshad.kotlinpractice.model.Company
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    val INTENT_DATA_PASS ="datapass"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val getDataFromFirstAct = intent.getStringExtra(INTENT_DATA_PASS)
        requireNotNull(getDataFromFirstAct) { "no user_id provided in Intent extras" }
        datavalue.setText(getDataFromFirstAct)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val company = ArrayList<Company>()

        //adding some dummy data to the list
        company.add(Company("ABC Pvt Ltd.", "Kanpur, Uttar Pradesh"))
        company.add(Company("DEF Pvt Ltd.", "Bangalore, Karnataka"))
        company.add(Company("GHI Pvt Ltd", "Mumbai Maharashtra"))
        company.add(Company("JKL Pvt Ltd", "Noida, Uttar Pradesh"))
        company.add(Company("MNO Pvt Ltd", "Chennai, Tamil Nadu"))

        val adapter = CompanyListAdapter(company)

        recyclerView.adapter = adapter
    }
}
