package com.example.loginpage_design

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.loginpage_design.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityLoginBinding
    private lateinit var myIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        myIntent = Intent(this,GetStartedActivity::class.java)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        binding.loginbutton.setOnClickListener {
            startActivity(myIntent)
        }
    }
}