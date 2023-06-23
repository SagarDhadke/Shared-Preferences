
# Shared Preferences in Android

Save simple data with SharedPreferences


## Acknowledgements

 - [Android Official Documentation](https://developer.android.com/training/data-storage/shared-preferences)


## Clone This Project

```bash
  https://github.com/SagarDhadke/Shared-Preferences.git
```
#### My_Login file name and Store Mod in MODE_PRIVATE

```bash
 val editor = getSharedPreferences("My_Login", MODE_PRIVATE)

 binding.signInEmail.setText(editor.getString("email",null))
 binding.signInPassword.setText(editor.getString("password",null))
```

#### Save All Data in Shared Preferences

```bash
            val editor = getSharedPreferences("My_Login", MODE_PRIVATE).edit()
            editor.putString("email",binding.signInEmail.text.toString())
            editor.putString("password",binding.signInPassword.text.toString())
            editor.apply()

```





## Screenshots

![App Screenshot](https://github.com/SagarDhadke/Shared-Preferences/assets/70995022/e0281d07-7cd0-4f15-a5db-b6cf86573682)
)


## Support

For support, email peaceunique2003@gmail.com

