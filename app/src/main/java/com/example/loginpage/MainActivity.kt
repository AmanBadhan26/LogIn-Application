package com.example.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etPassword: EditText
    lateinit var btnLogin: Button
    lateinit var tvForgotPass: TextView
    lateinit var tvSignup: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvSignup=findViewById(R.id.tvSignup)
        tvForgotPass=findViewById(R.id.tvForgot_password)
        etName = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            System.out.println("Button is clicked")
            if(etName.text.isNullOrEmpty()) {
                etName.error = resources.getString(R.string.empty_username)
            }
            else if(etPassword.text.isNullOrEmpty()){
                etPassword.error= resources.getString(R.string.empty_password)

            }
            else if(etPassword.text.length<6){
                etPassword.error= resources.getString(R.string.short_pass)
            }
            else{
                Toast.makeText(this, resources.getString(R.string.loggedIn), Toast.LENGTH_LONG).show()
                //var intent= Intent(this,ForgotPassActivity::class.java)
                //startActivity(intent)
            }
            //this portion is to check if the input is registered *will not be implemented in final project*
            val username=etName.text.toString()
            val pass=etPassword.text.toString()
            System.out.println("Username = $username")
            System.out.println("Password = $pass")

        }
        tvForgotPass.setOnClickListener {
            var intent= Intent(this,ForgotPassActivity::class.java)
            startActivity(intent)
        }
        tvSignup.setOnClickListener{
            var intent2= Intent(this, SignUpActivity::class.java)
            startActivity(intent2)
        }




    }
}