package net.uniquecomputer.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.uniquecomputer.sharedpreferences.databinding.ActivityShowDataBinding

class ShowData : AppCompatActivity() {
    lateinit var binding: ActivityShowDataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editor = getSharedPreferences("My_Login", MODE_PRIVATE)

        binding.showdata.setText("Email :- ${editor.getString("email",null)}" +
                "Password :- ${editor.getString("password",null)}")

    }
}