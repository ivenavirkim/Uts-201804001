package com.ivenavm.uts_201804001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_indonesia.*

class IndonesiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indonesia)
        val indonesia: WebView = findViewById(R.id.indonesia)
        indonesia.settings.javaScriptEnabled = true
        indonesia.loadUrl("file:///android_asset/kenal_indonesia/index.html")

    }
}