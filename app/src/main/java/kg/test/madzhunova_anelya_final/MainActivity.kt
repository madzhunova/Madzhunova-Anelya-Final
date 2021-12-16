package kg.test.madzhunova_anelya_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`product`)

        val textView = findViewById<TextView>(R.id.textView)

        textView.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}