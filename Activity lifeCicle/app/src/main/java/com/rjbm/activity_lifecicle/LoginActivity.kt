package com.rjbm.activity_lifecicle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun onStart() {
        super.onStart()

        Messenger.showMessage(this, "Login: Actividad iniciada")
    }

    override fun onStop() {
        super.onStop()

        Messenger.showMessage(this, "Login: Actividad detenida")
    }

    /*
        Activities
            View (XML)
                Layout
                    Constraint
                    Linear
                    Relative
            Class (Kotlin)
                AppCompatActivity()
            Lifecycle
                Methods executed
                    onCreate
                    onStart
                    onResume
                    onRestart
                    onStop
                    onDestroy
                    onPause

            Navigation
                React: useHistory (Hooks)
                Browser

            Grafico de navegacion
                Navigation.xml
                    - Frag1
                    - Frag2
                    - Frag3
                    - Frag4
            NavHost -> NavHostFragment
                - Empty container
                - Locations
            NavController
                - Object
                - Inside a NavHost

            ViewModel -> Design pattern

            Fragments (Componente ReactJS) -> (Page)
                UI reusable

     */
}