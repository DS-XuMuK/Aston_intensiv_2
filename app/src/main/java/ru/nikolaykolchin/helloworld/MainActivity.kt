package ru.nikolaykolchin.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : AppCompatActivity(), OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button1).setOnClickListener(this)
        findViewById<Button>(R.id.button2).setOnClickListener(this)
        findViewById<Button>(R.id.button3).setOnClickListener(this)
        findViewById<Button>(R.id.button4).setOnClickListener(this)
        findViewById<Button>(R.id.button5).setOnClickListener(this)
        findViewById<Button>(R.id.button6).setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        if (view != null) {
            val intent = when (view.id) {
                R.id.button1 -> Intent(this@MainActivity, FirstActivity::class.java)
                R.id.button2 -> Intent(this@MainActivity, SecondActivity::class.java)
                R.id.button3 -> Intent(this@MainActivity, ThirdActivity::class.java)
                R.id.button4 -> Intent(this@MainActivity, FourthActivity::class.java)
                R.id.button5 -> Intent(this@MainActivity, FifthActivity::class.java)
                R.id.button6 -> Intent(this@MainActivity, SixthActivity::class.java)
                else -> {throw Exception("Invalid value!")}
            }
            startActivity(intent)
        }
    }
}