package com.edsonrego.auladebugger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var listaUsuarios = listOf("Ana", "Bia", "Gui", "Rebeca")

        exibirListaItens(listaUsuarios)
    }

    private fun exibirListaItens(listaUsuarios: List<String>) {

        var exibirPrimeiroUsuario = true
        var contatorItens = 0

        for (usuario in listaUsuarios) {
            if(exibirPrimeiroUsuario){
                println("O primeiro item é $usuario")")
                exibirPrimeiroUsuario = false
            }
            println(usuario)
            contatorItens++
        }
    }
}