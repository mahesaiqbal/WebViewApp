package com.mahesaiqbal.webviewapp

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview.webViewClient = MyWebViewClient()

        btn_go.setOnClickListener {
            webview.loadUrl("https://" + edt_url.text.toString())
        }

        btn_back.setOnClickListener {
            if (webview.canGoBack()) {
                webview.goBack()
            } else {
                Toast.makeText(this, "No history available", Toast.LENGTH_SHORT).show()
            }
        }

        btn_forward.setOnClickListener {
            if (webview.canGoForward()) {
                webview.goForward()
            } else {
                Toast.makeText(this, "No history available", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
