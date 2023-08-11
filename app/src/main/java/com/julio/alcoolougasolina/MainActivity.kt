package com.julio.alcoolougasolina

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var btnCalcular : Button
    private lateinit var editAlcool : EditText
    private lateinit var editGasolina : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btn_calcular)
        editAlcool = findViewById(R.id.edit_alcool)
        editGasolina = findViewById(R.id.edit_gasolina)

        btnCalcular.setOnClickListener {

            val intent = Intent(
                this,
                ResultadoActivity::class.java)

            val alcool = editAlcool.text.toString()
            val gasolina = editGasolina.text.toString()

            if ( alcool.isNotEmpty() && gasolina.isNotEmpty() ) {

                intent.putExtra("alcool", alcool.toDouble())
                intent.putExtra("gasolina", gasolina.toDouble())

            }



            startActivity( intent )

        }




    }
}