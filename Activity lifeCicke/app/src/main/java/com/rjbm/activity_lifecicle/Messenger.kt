package com.rjbm.activity_lifecicle

import android.content.Context
import android.widget.Toast

class Messenger() {
    companion object {
        fun showMessage(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}