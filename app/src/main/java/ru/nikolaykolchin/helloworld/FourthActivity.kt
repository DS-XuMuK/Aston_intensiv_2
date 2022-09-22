package ru.nikolaykolchin.helloworld

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FourthActivity : AppCompatActivity() {
    private var mCount: Int = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        mShowCount = findViewById(R.id.show_count)
    }

    fun sayHello(view: View) {
        val intent = Intent(this@FourthActivity, SayHelloActivity::class.java)
        intent.putExtra("message", mShowCount.text)
        startActivity(intent)
    }

    fun countUp(view: View) {
        mCount++
        mShowCount.text = mCount.toString()
    }
}