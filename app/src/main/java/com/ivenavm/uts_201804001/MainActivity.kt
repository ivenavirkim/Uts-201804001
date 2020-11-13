package com.ivenavm.uts_201804001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username : TextView = findViewById(R.id.username)
        val btn_login : Button = findViewById(R.id.btn_login)

        btn_login.setOnClickListener{
            val bundle = Bundle()
            bundle.putString("ivena",username.text.toString())
            val intent = Intent(this,Klik::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }

    }
}