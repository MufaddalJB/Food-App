package com.internshala.foodrunner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var num:EditText
    lateinit var btnLog:Button
    lateinit var pas:EditText
    lateinit var txtForgot:TextView
    lateinit var sign:TextView
val validNumber="123456789"
    val validPassword= arrayOf("muf","mark","rahul")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            setContentView(R.layout.login_activity)
        num=findViewById(R.id.num)
        btnLog=findViewById(R.id.btnlog)
        pas=findViewById(R.id.pas)
        txtForgot=findViewById(R.id.txtForgot)
        sign=findViewById(R.id.sign)

btnLog.setOnClickListener {
    val phonenumber=num.text.toString()
    val password= pas.text.toString()
    var nameofprofile="Profile"
    val intent=Intent(this@MainActivity,ProfileActivity::class.java)
    if(phonenumber==validNumber){
        if(password==validPassword[0]) {
            nameofprofile = "Mufaddal"
            intent.putExtra("Name", nameofprofile)
            startActivity(intent)
        }
       else if (password==validPassword[1]){
            nameofprofile="Mark"
            intent.putExtra("Name",nameofprofile)
            startActivity(intent)
        }

        else if(password==validPassword[2]) {
                nameofprofile = "Rahul"
                intent.putExtra("Name", nameofprofile)
                startActivity(intent)
            }
        else{
            Toast.makeText(this@MainActivity,"Invalid credentials",Toast.LENGTH_SHORT)
            startActivity(intent)
            }
    }


}

        txtForgot.setOnClickListener{
            val intent=Intent(this@MainActivity,ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
        sign.setOnClickListener{
            val intent=Intent(this@MainActivity,RegiterActivity::class.java)
            startActivity(intent)
        }

    }


}