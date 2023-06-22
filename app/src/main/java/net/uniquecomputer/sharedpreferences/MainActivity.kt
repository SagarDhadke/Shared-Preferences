package net.uniquecomputer.sharedpreferences

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.uniquecomputer.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editor = getSharedPreferences("My_Login", MODE_PRIVATE)
        binding.signInEmail.setText(editor.getString("email",null))
        binding.signInPassword.setText(editor.getString("password",null))

        binding.signInBtn.setOnClickListener {

            val editor = getSharedPreferences("My_Login", MODE_PRIVATE).edit()
            editor.putString("email",binding.signInEmail.text.toString())
            editor.putString("password",binding.signInPassword.text.toString())
            editor.apply()
            startActivity(Intent(this,ShowData::class.java))

        }

    }
}