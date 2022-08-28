package com.example.loginpage_design

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.loginpage_design.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var  binding: ActivitySignUpBinding
    private lateinit var myIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myIntent = Intent(this,LoginActivity::class.java)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_sign_up)
        binding.signupbutton.setOnClickListener {
            startActivity(myIntent)
        }
    }
}