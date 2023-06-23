package net.uniquecomputer.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.uniquecomputer.sharedpreferences.databinding.ActivityForgetPasswordBinding

class ForgetPassword : AppCompatActivity() {

    lateinit var binding: ActivityForgetPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val editor = getPreferences(MODE_PRIVATE)
        binding.forgetpass.setText(editor.getString("email",null))
        binding.checkBox.isChecked = editor.getBoolean("checked",false)

        binding.forgetpassBtn.setOnClickListener {

            val editor = getPreferences(MODE_PRIVATE).edit()
            editor.putString("email",binding.forgetpass.text.toString())
            editor.putBoolean("checked",binding.checkBox.isChecked)
            editor.apply()
        }



    }
}