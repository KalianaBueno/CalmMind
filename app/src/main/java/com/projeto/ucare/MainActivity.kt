package com.projeto.ucare

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meuCardView1 = findViewById<CardView>(R.id.card1)

        meuCardView1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                // Ação a ser executada quando o CardView for clicado
                // Neste exemplo, estamos abrindo a atividade "MeditacoesActivity"
                val intent = Intent(this@MainActivity, MeditacoesActivity::class.java)
                startActivity(intent)
            }
        })

        val meuCardView2 = findViewById<CardView>(R.id.card2)

        meuCardView2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                // Ação a ser executada quando o CardView for clicado
                // Neste exemplo, estamos abrindo a atividade "MeditacoesActivity"
                val intent = Intent(this@MainActivity, RespiracaoActivity::class.java)
                startActivity(intent)
            }
        })

        val meuCardView = findViewById<CardView>(R.id.card)

        meuCardView.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                // Ação a ser executada quando o CardView for clicado
                // Neste exemplo, estamos abrindo a atividade "MeditacoesActivity"
                val intent = Intent(this@MainActivity, ReconstrucaoActivity::class.java)
                startActivity(intent)
            }
        })





    }
}


//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }
//}