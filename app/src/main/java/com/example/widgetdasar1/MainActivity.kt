package com.example.widgetdasar1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import com.example.widgetdasar1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var latihan: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        latihan = ActivityMainBinding.inflate(layoutInflater)
        setContentView(latihan.root)

        val radioPria = latihan.rbPria
        val radioWanita = latihan.rbWanita

        radioPria.setOnClickListener { onRbClicked(radioPria) }
        radioWanita.setOnClickListener { onRbClicked(radioWanita) }
    }

    private fun onRbClicked(radioButton: RadioButton) {
        if (radioButton.isChecked) {
            val nama = latihan.etNama.text.toString()
            val jenisKelamin = if (radioButton == latihan.rbPria) "Pria" else "Wanita"

            val message = "Anda Bernama $nama seorang $jenisKelamin"
            Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
        }
    }
    fun onCbClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            val hobbies = mutableListOf<String>()

            if (latihan.cbCoding.isChecked) {
                hobbies.add(latihan.cbCoding.text.toString())
            }

            if (latihan.cbTraveling.isChecked) {
                hobbies.add(latihan.cbTraveling.text.toString())
            }

            if (latihan.cbCooking.isChecked) {
                hobbies.add(latihan.cbCooking.text.toString())
            }

            when (view.id) {
                R.id.cb_coding, R.id.cb_traveling, R.id.cb_cooking -> {
                    if (checked) {
                        val nama = latihan.etNama.text.toString()
                        val hobbiesText = if (hobbies.isNotEmpty()) hobbies.joinToString(", ") else "tidak memiliki hobi"
                        val message = "$nama memiliki hobi: $hobbiesText"
                        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext, "Anda batal memilih ${view.text}", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

}
