package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class SignUpActivity : AppCompatActivity() {
    lateinit var etSignup_firstname: EditText
    lateinit var etSignup_middlename: EditText
    lateinit var etSignup_lastname: EditText
    lateinit var rbGender_male: RadioButton
    lateinit var rbGender_female: RadioButton
    lateinit var rbGender_other: RadioButton
    lateinit var rgGender: RadioGroup
    lateinit var etGender_other: EditText
    lateinit var btnSignup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        etSignup_firstname= findViewById(R.id.etSignup_firstname)
        etSignup_middlename= findViewById(R.id.etSignup_middleName)
        etSignup_lastname= findViewById(R.id.etSignup_lastname)
        rbGender_male=findViewById(R.id.rbMale)
        rbGender_female=findViewById(R.id.rbFemale)
        rbGender_other=findViewById(R.id.rbOther_gender)
        rgGender=findViewById(R.id.rgGender)
        etGender_other=findViewById(R.id.etOther_gender)
        btnSignup=findViewById(R.id.btnSignup)

        btnSignup.setOnClickListener{
            if (etSignup_firstname.text.isNullOrEmpty()){
                etSignup_firstname.error= resources.getString(R.string.empty_username)
            }
            else if(etSignup_lastname.text.isNullOrEmpty()){
                etSignup_lastname.error= resources.getString(R.string.empty_lastname)
            }
            
        }
    }
}