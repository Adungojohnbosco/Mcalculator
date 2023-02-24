package com.johnbosco.mycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun BuClickEvent(View:View){
        val DOB = findViewById<EditText>(R.id.edittext1)
        val SHOWAGE = findViewById<TextView>(R.id.textView2)

        val userDOB:String = DOB.text.toString()
        if (userDOB.toInt()==0){
            SHOWAGE.text ="invalid input"
            return
        }
        val year:Int=Calendar.getInstance().get(Calendar.YEAR)
        //Instance reguired to make a call to a member
        val myAge =year-userDOB.toInt()
        val avg = myAge/userDOB.toInt()
        SHOWAGE.text="your age is$myAge"
    }
}