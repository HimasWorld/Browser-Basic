import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // This links to activity_main.xml

        // Initialize WebView
        val myWebView: WebView = findViewById(R.id.myWebView)

        // Ensure links open in the WebView itself, not in the browser
        myWebView.webViewClient = WebViewClient()

        // Enable JavaScript (optional, depending on your needs)
        myWebView.settings.javaScriptEnabled = true

        // Load a website (you can replace this URL with any website)
        myWebView.loadUrl("https://www.google.com")
    }
}
