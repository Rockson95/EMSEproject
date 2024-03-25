package com.automacorp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    companion object {
        const val WINDOW_NAME_PARAM = "com.automacorp.windowname.attribute"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openWindow(view: View) {
        // Extract value filled in editext identified with txt_window_name id
        val windowName = findViewById<EditText>(R.id.txt_window_name).text.toString()

        val intent = Intent(this, WindowActivity::class.java).apply {
            putExtra(WINDOW_NAME_PARAM, windowName)
        }
        startActivity(intent)
    }



}