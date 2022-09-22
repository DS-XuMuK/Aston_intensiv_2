package ru.nikolaykolchin.helloworld

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SayHelloActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_say_hello)

        val mCount = findViewById<TextView>(R.id.counter)
        val message: String = intent.getStringExtra("message") ?: "no data"
        mCount.text = message
    }
}