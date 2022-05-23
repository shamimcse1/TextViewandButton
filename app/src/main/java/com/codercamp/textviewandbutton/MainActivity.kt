package com.codercamp.textviewandbutton

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private  lateinit var  tv: TextView
    private  lateinit var btn:Button
    var count: Int = 0;
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.btnClick)
        tv = findViewById(R.id.textView)
        btn.setOnClickListener(){
            val  random = (1..10).random()
            count++
            tv.text = "Count $count"

        }
    }
}