package com.julio.alcoolougasolina

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {

    private lateinit var textAlcool : TextView
    private lateinit var textGasolina : TextView
    private lateinit var textResultado : TextView
    private lateinit var btnVoltar : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        textAlcool = findViewById(R.id.text_alcool)
        textGasolina = findViewById(R.id.text_gasolina)
        textResultado = findViewById(R.id.text_resultado)
        btnVoltar = findViewById(R.id.btn_voltar)

        val bundle = intent.extras
        if ( bundle != null ) {

            val alcool = bundle.getDouble("alcool")
            val gasolina = bundle.getDouble("gasolina")

            textAlcool.text = "Preço do Alcool: $alcool"
            textGasolina.text = "Preço da Gasolina: $gasolina"

            val resultado = alcool / gasolina

            val valorFinal = if (resultado > 0.7){
                "Gasolina"
            } else {
               "Alcool"
            }

            textResultado.text = valorFinal

        }
        btnVoltar.setOnClickListener {
            finish()
        }



    }
}