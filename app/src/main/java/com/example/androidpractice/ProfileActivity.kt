package com.example.androidpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidpractice.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user: User = intent.getParcelableExtra("user")!!
        binding.name.text= user.name
        binding.email.text = user.email
        binding.password.text = user.password
    }
}