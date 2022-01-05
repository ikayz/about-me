package com.ikayz.kotlin.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)

        }
    }

    private fun addNickname(view: View) {
        val nickname = findViewById<EditText>(R.id.nickname_edit)
        val displayNickname = findViewById<TextView>(R.id.nickname_text)
        displayNickname.text = nickname.text
        nickname.visibility = View.GONE
        displayNickname.visibility = View.VISIBLE
        view.visibility = View.GONE
    }
}