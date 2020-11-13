package com.ivenavm.uts_201804001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.*

class Klik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_klik)

        val profile : Button = findViewById(R.id.btn_profile)
 profile.setOnClickListener{
     val intent = Intent(this,ProfilActivity::class.java)
     startActivity(intent)
 }

        val rating : Button = findViewById(R.id.btn_rating)
        rating.setOnClickListener{
            val intent = Intent(this,RatingActivity::class.java)
            startActivity(intent)
        }

        val skin : Button = findViewById(R.id.btn_skincare)
        skin.setOnClickListener{
            val intent = Intent(this,SkincareActivity::class.java)
            startActivity(intent)
        }

        val web : Button = findViewById(R.id.btn_web)
        web.setOnClickListener{
            val intent = Intent(this,WebActivity::class.java)
            startActivity(intent)
        }

        val indo : Button = findViewById(R.id.btn_data)
        indo.setOnClickListener{
            val intent = Intent(this,IndonesiaActivity::class.java)
            startActivity(intent)
        }

    }
}