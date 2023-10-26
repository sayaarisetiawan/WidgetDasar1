package com.example.widgetdasar1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onCbClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            when (view.id) {
                R.id.cb_coding -> {
                    if (checked) {
                        Toast.makeText(applicationContext,
                            "${cb_coding.text} terpilih",
                            Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext,
                            "${cb_coding.text} tidak terpilih",
                            Toast.LENGTH_SHORT).show()
                    }
                }
                R.id.cb_traveling -> {
                    if (checked) {
                        Toast.makeText(applicationContext,
                            "${cb_traveling.text} terpilih",
                            Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext,
                            "${cb_traveling.text} tidak terpilih",
                            Toast.LENGTH_SHORT).show()
                    }

                }
                R.id.cb_traveling -> {
                    if (checked) {
                        Toast.makeText(applicationContext,
                            "${cb_cooking.text} terpilih",
                            Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(applicationContext,
                            "${cb_cooking.text} tidak terpilih",
                            Toast.LENGTH_SHORT).show()
                    }

                }
            }
        }
    }


    fun onRbClicked(view: View) {
        if (view is RadioButton) {

            val checked = view.isChecked

            when (view.id) {
                R.id.rb_pria -> {
                    if (checked) {
                        Toast.makeText(
                            applicationContext,
                            "Diklik: ${view.text}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
                R.id.rb_wanita -> {
                    if (checked) {
                        Toast.makeText(
                            applicationContext,
                            "Diklik: ${view.text}",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            }
        }
    }
}
