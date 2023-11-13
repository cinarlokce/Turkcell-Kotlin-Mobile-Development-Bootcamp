package com.works.odev_6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try{
            val arr = EczaneResult().gaziAntep()
            val listAdapter = ArrayAdapter<String>(this,R.layout.activity_main,R.id.lstEczane)
            arr.forEach { ilce, adresler ->

                listAdapter.add(ilce)

                adresler.forEach { eczane ->
                    listAdapter.add(" $eczane")
                }
            }
            val eczaneListesi = findViewById<ListView>(R.id.lstEczane)
            eczaneListesi.adapter = listAdapter
        }
        catch (ex:Exception){
            println(ex.toString())
        }


    }
}