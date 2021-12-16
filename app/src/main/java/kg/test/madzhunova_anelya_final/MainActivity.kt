package kg.test.madzhunova_anelya_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.`product.xml`)

        val textView = findViewById<TextView>(R.id.textView)

        textView.setOnClickListener{
            startActivity(Int(this,MainActivity::class.java))
        }
    }
}