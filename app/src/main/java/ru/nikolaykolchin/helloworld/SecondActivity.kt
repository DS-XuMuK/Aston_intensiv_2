package ru.nikolaykolchin.helloworld

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    private var mCount: Int = 0
    private lateinit var mShowCount: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }

    fun countUp(view: View) {
        mCount++
        mShowCount.text = mCount.toString()
        if (mCount % 2 == 1) view.setBackgroundColor(Color.GREEN) else view.setBackgroundColor(Color.BLUE)
        findViewById<Button>(R.id.button_zero).setBackgroundColor(Color.CYAN)
    }

    fun countZero(view: View) {
        mCount = 0
        mShowCount.text = mCount.toString()
        view.setBackgroundColor(Color.GRAY)
    }
}