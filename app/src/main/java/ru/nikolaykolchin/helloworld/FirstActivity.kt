package ru.nikolaykolchin.helloworld

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Log.v("MainActivity", "Verbose logging statement")
        Log.d("MainActivity", "Debug logging statement")
        Log.i("MainActivity", "Info logging statement")
        Log.w("MainActivity", "Warn logging statement")
        Log.e("MainActivity", "Error logging statement")
    }
}