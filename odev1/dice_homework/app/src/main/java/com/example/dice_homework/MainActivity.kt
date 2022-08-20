package com.example.dice_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.dice_homework.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        var randomNumber = (1..6).random()
        binding.numberTextView.text = "${randomNumber} rolled."
        if (randomNumber==1){
            binding.imageView.setImageResource(R.drawable.ic_dice_1_svgrepo_com)
        }
        if (randomNumber==2){
            binding.imageView.setImageResource(R.drawable.ic_dice_2_svgrepo_com)
        }
        if (randomNumber==3){
            binding.imageView.setImageResource(R.drawable.ic_dice_3_svgrepo_com)
        }
        if (randomNumber==4){
            binding.imageView.setImageResource(R.drawable.ic_dice_4_svgrepo_com)
        }
        if (randomNumber==5){
            binding.imageView.setImageResource(R.drawable.ic_dice_5_svgrepo_com)
        }
        if (randomNumber==6){
            binding.imageView.setImageResource(R.drawable.ic_dice_6_svgrepo_com)
        }
    }

}