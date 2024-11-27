package browser.basic

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity  // Import AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // This links to the layout XML

        val myWebView: WebView = findViewById(R.id.myWebView)  // Initialize WebView

        // Enable WebView to handle links within itself
        myWebView.webViewClient = WebViewClient()

        // Enable JavaScript if needed
        myWebView.settings.javaScriptEnabled = true

        // Load a webpage (you can replace with any URL)
        myWebView.loadUrl("https://www.google.com")
    }
}
