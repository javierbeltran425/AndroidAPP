package com.rjbm.activity_lifecicle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*
    onCreate()
    onStart()
    onRestart()
    onResume()
        onPause()
        onStop()
        onDestroy()
    */

    /*
    override fun onStart() {
        super.onStart()

        Toast.makeText(this, "Aplicación iniciada", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Toast.makeText(this, "Aplicación Reiniciada", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Toast.makeText(this, "Aplicación pausada", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this, "Aplicación detenida", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        Toast.makeText(this, "Aplicación destruida", Toast.LENGTH_SHORT).show()
    }
    */

    override fun onStart() {
        super.onStart()

        Messenger.showMessage(this, "Main: Actividad iniciada")
    }

    override fun onStop() {
        super.onStop()

        Messenger.showMessage(this, "Main: Actividad detenida")
    }

    fun onLoginBtnClick(view: View) {
        // Intent -> Vinculacion en runtime
        val intent = Intent(this, LoginActivity::class.java)

        startActivity(intent)
    }
}