package com.example.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name: String = "afghdgjhg";// we can not val variable but we can use val only again and again
        var roll: Int = 79;// because val is data type
        val add: String = "gurgaon"
        val pin: Int = 56;
        println("printing values will be as=" + name + "" + roll)
        println()
        println("val variables string and integer values will be=" + add + "" + pin)
    }
}
