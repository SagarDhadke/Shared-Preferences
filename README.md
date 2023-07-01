
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

## 🔗 Follow Me 
[![instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://www.instagram.com/sagardhadke_uc/)

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/sagar-dhadke-6a466b206/)

[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/sagardhadke_uc)


[![Bug me a Coffee](https://img.shields.io/badge/donate-buy%20me%20a%20coffee-yellow?label=Donate&style=flat-square)](https://www.buymeacoffee.com/sagardhadke)
