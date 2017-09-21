package com.irshad.kotlinpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvAge.setText("");


    }

    public fun calculateAge(view: View){
        val dob: String = etAge.text.toString();
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)

        val age = currentYear - dob.toInt()
        if((dob.toInt()<= currentYear) && (dob.length==4)){
            if(age>0){
                tvAge.setText("Your age is $age")
            }
            else{
                tvAge.setText("Please enter valid year")
            }

        }
        else{
            tvAge.setText("Please enter valid year")
        }

    }
}
