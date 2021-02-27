package com.rjbm.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var editText: EditText? = null
    var showBtn: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.editText)
        showBtn = findViewById(R.id.showBtn)
    }

    fun onShowBtnClicked(view: View) {
        Toast.makeText(this, editText?.text, Toast.LENGTH_SHORT).show()
    }
}