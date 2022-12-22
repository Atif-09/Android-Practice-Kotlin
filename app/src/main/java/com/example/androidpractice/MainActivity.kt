package com.example.androidpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.PersonName.text.isNotEmpty() && binding.EmailAddress.text.isNotEmpty()
                && binding.TextPassword.text.isNotEmpty()){
                val name = binding.PersonName.text.toString()
                val email = binding.EmailAddress.text.toString()
                val password = binding.TextPassword.text.toString()

                val user = User(name, email, password)

                val intent = Intent(this, ProfileActivity::class.java)
                intent.putExtra("user", user)
                startActivity(intent)
            }
        }

    }
}