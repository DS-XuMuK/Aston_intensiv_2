package ru.nikolaykolchin.helloworld

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FifthActivity : AppCompatActivity() {
    private var mCounter: Int = 0
    private lateinit var mShowCounter: TextView

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("count", mShowCounter.text.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        mShowCounter = findViewById(R.id.textView2)
        if (savedInstanceState != null && savedInstanceState.containsKey("count")) {
            val str: String = savedInstanceState.getString("count") ?: "0"
            mShowCounter.text = str
            mCounter = str.toInt()
        }
    }

    fun counterUp(view: View) {
        mCounter++
        mShowCounter.text = mCounter.toString()
    }
}