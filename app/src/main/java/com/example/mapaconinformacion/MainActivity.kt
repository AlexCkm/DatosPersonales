package com.example.mapaconinformacion

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.mapaconinformacion.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        //Botones
        binding.btnAgregar.setOnClickListener {
            val mapa = mutableMapOf<String, String>()
        }
        binding.btnEnviar.setOnClickListener {

        }

        fun getAndSend(){
            val intentResult = Intent(this, ResultActivity::class.java)
            intentResult.putExtra("Nombre", binding.etDatos.text.toString())
            startActivity(intentResult)
        }



        //Spinner
        val adaptador: ArrayAdapter<*> = ArrayAdapter.createFromResource(this,
            R.array.Datos, android.R.layout.simple_spinner_item
        )
        binding.spinner.adapter = adaptador
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?,
                                        view: View?,
                                        position: Int,
                                        id: Long) {
                Toast.makeText(this@MainActivity, "Seleccion:" .plus(position.toString()),Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "Sin seleccionar:", Toast.LENGTH_SHORT).show()
            }
        }

    }
}