package com.irshad.kotlinpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.irshad.kotlinpractice.uiactivity.RecyclerViewActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvAge.setText("Your age will display here.");
//        https://www.simplifiedcoding.net/kotlin-recyclerview-example/


    }

    public fun calculateAge(view: View){
        val dob: String = etAge.text.toString();
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        val age = currentYear - dob.toInt()
        if((dob.toInt()<= currentYear) && (dob.length==4)){
            if(age>0){
                tvAge.setText("Your age is $age .")
            }
            else{
                tvAge.setText("Please enter valid year")
            }

        }
        else{
            tvAge.setText("Please enter valid year")
        }

    }


    public fun showlist(view: View){
       val INTENT_DATA_PASS ="datapass"
        val intent = Intent(this, RecyclerViewActivity::class.java)
        intent.putExtra(INTENT_DATA_PASS,"Company List")
         startActivity(intent)
    }
}
