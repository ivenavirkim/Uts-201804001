package com.ivenavm.uts_201804001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        val webviewku: WebView = findViewById(R.id.webviewku)
        webviewku.settings.javaScriptEnabled = true
        webviewku.loadUrl("https://www.sociolla.com/")
        //webviewku.loadUrl("file:///android_asset/kenal_indonesia/index.html")

    }
}