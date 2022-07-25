package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class ForgotPassActivity : AppCompatActivity() {
    lateinit var etForgot_name: EditText
    lateinit var etForgot_email: EditText
    lateinit var etForgot_mobile: EditText
    lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pass)
        etForgot_name=findViewById(R.id.forgot_username)
        etForgot_mobile=findViewById(R.id.forgot_mobile)
        etForgot_email=findViewById(R.id.forgot_email)
        btnSubmit=findViewById(R.id.forgot_submit)

        btnSubmit.setOnClickListener {
            if (etForgot_name.text.isNullOrEmpty()) {
                etForgot_name.error = resources.getString(R.string.empty_username)
            }
            else if (etForgot_email.text.isNullOrEmpty()){
                etForgot_email.error= resources.getString(R.string.empty_email)
            }
            else if (etForgot_mobile.text.isNullOrEmpty()){
                etForgot_mobile.error= resources.getString(R.string.empty_mobile)
            }
            else if (etForgot_mobile.text.length!=10){
                etForgot_mobile.error=resources.getString(R.string.invalid_mobile)
            }
            else{
                Toast.makeText(this, resources.getString(R.string.report_submitted), Toast.LENGTH_LONG).show()
            }

        }

    }
}