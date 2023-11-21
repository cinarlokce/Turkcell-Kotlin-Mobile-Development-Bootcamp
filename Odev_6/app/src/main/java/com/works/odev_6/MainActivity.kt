package com.works.odev_6

import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import androidx.core.view.forEach

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnA = findViewById<Button>(R.id.btnA)

        btnA.setOnClickListener {
            operation()
        }

    }

    fun operation (){
        try {
            val eczaneList = findViewById<ListView>(R.id.lstEczane)
            val arr = EczaneResult().gaziAntep()
            var ilceListe = mutableListOf<String>()
            var eczListe = mutableListOf<String>()

            arr.keys.forEach {
                ilceListe.add(it)
            }
            arr.values.forEach{
                eczListe.add(it.toString())
            }

            val eczAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1)

            ilceListe.forEach{
                eczAdapter.add(it)

                eczListe.forEach {
                    eczAdapter.add(it)
                }
            }
            eczaneList.adapter = eczAdapter

            eczaneList.forEach { if (it.toString().contains("NÖBETÇİ ECZANELER")){
                eczaneList.setBackgroundColor(Color.RED)
            }
            }
        }catch (ex: Exception){
            ex.printStackTrace()
        }
    }
}