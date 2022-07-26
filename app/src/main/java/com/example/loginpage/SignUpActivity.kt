package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

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


        rgGender.setOnCheckedChangeListener { radioGroup, id -> if(id==R.id.rbOther_gender)
         {
            etGender_other.visibility= View.VISIBLE
             }

        else {
            etGender_other.visibility= View.GONE
            }

        }

        btnSignup.setOnClickListener{
            if (etSignup_firstname.text.isNullOrEmpty()){
                etSignup_firstname.error= resources.getString(R.string.empty_username)
            }
            else if(etSignup_lastname.text.isNullOrEmpty()){
                etSignup_lastname.error= resources.getString(R.string.empty_lastname)
            }
            else if(rgGender.checkedRadioButtonId==-1){
                Toast.makeText(this, "Please select a gender", Toast.LENGTH_SHORT).show()
            }
            else if(rbGender_other.isChecked && etGender_other.text.isNullOrEmpty()){
                etGender_other.error= resources.getString(R.string.SpecifyGender)
            }

            else
            {
                Toast.makeText(this, "Signup Successful", Toast.LENGTH_SHORT).show()

              }


        }

    }
}