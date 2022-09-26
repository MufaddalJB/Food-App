package com.internshala.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

lateinit var reg:Button
class RegiterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.register_activity)
        reg=findViewById(R.id.reg)
        reg.setOnClickListener {
            val intent=Intent(this@RegiterActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }
}