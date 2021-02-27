package com.example.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count = 0
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.counterNumber)
    }

    // FindViewById -> los ID's existentes dentro de lo componentes declarados
    // en todas las actividades

    // Arbol de views (arbol de componentes) Binary search -> coincidencia
    // DataBinding -> Patron de diseño (implementacion) valor, ref (calve, valor)

    fun incrementCounter(view: View) {
        if(!checkLimits(count + 1)) {
            count++
            textView?.text = count.toString()
        }
    }

    fun decrementCounter(view: View) {
        if(!checkLimits(count - 1)) {
            count--
            textView?.text = count.toString()
        }
    }

    private fun checkLimits(count: Int): Boolean {
        if(count !in 0..10) {
            Toast.makeText(this, "El contador no puede salirse de los limites", Toast.LENGTH_SHORT).show()
            return true
        }
        return false
    }
}