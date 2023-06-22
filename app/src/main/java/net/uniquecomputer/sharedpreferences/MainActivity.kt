package net.uniquecomputer.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.uniquecomputer.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}