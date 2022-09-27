package com.example.planetproject.ui.activity

import android.content.Intent
import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.planetproject.R
import com.example.planetproject.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val text = "<font color=#ffffff>Let’s Explore the</font> <font color=#F9AD1A>Solar System</font><font color=#ffffff>with</font> <font color=#F9AD1A>Explorer</font> "
        binding.textView.setText(Html.fromHtml(text))

        binding.button.setOnClickListener {
            intent=Intent(this,PlanetActivity::class.java)
            startActivity(intent)
        }
    }

}