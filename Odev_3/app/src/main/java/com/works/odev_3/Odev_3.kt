package com.works.odev_3

import android.system.Os
import java.io.File
import java.io.FileWriter
import kotlin.random.Random

fun main(args: Array<String>) {
    val filepath = "C:/Users/HP/Documents/GitHub/Turkcell-Kotlin-Mobile-Development-Bootcamp/Odev_3/app/src/main/java/com/works/odev_3/Input/input.txt"
    val dumpPath = "C:/Users/HP/Desktop/dump.txt"
    val input = File(filepath)

        input.createNewFile()
        input.writeText("")
        for (i in 1..15) {
            input.appendText((-100..100).random().toString()+"\n")
        }

    readInputText(filepath)
    fillData(filepath)
    oddEven(filepath)
}

// 1-)
fun readInputText(path: String){
    var pos = 0
    var neg = 0
    var odd = 0
    var even = 0

    val input = File(path)
    if (input.exists()) {
        val numberList = input.readLines()

        for (i in numberList) {
            if (i.toInt() > 0) {
                pos++
            } else {
                neg++
            }
            if (i.toInt() % 2 == 0) {
                even++
            } else {
                odd++
            }
        }
        println(
            """
                Verdiğiniz dosya yolundaki sayıların;
                $pos tanesi pozitif,
                $neg tanesi negatif,
                $odd tanesi tek ve $even tanesi çift sayıdır.
            """.trimIndent()
        )
    }else{
        println("Belirttiğiniz dosya yolu geçersiz.")
    }
}

// 2-)
fun fillData(path: String){

    val input = File(path)
    if (input.exists()){
        input.writeText("")
        for (i in 1..500) {
            input.appendText((-1000..1000).random().toString()+"\n")
        }
    }
}

// 3-)
fun oddEven(path: String){
    val input = File(path)
    val numberList = input.readLines()

    val tek=File("C:/Users/HP/Documents/GitHub/Turkcell-Kotlin-Mobile-Development-Bootcamp/Odev_3/app/src/main/java/com/works/odev_3/Input/T.txt")
    val cift = File("C:/Users/HP/Documents/GitHub/Turkcell-Kotlin-Mobile-Development-Bootcamp/Odev_3/app/src/main/java/com/works/odev_3/Input/C.txt")

    cift.createNewFile()
    cift.writeText("")
    tek.createNewFile()
    tek.writeText("")

    for(i in numberList){
        if ( i.toInt()%2 == 0 ){
            cift.appendText(i+"\n")
        }else{
            tek.appendText(i+"\n")
        }
    }
}

// 4-)
fun dumpInfo(path: String){
    val unluler = mutableListOf<Char>('a','e','ı','i','o','ö','u','ü')
    val dump = File(path)
    val satirSayisi = dump.readLines().size
    var unluSayisi = 0
    var unsuzSayisi = 0

    for (i in dump.readText()){
        if (unluler.contains(i)){
            unluSayisi++
        }else if (!unluler.contains(i) && i.isLetter()){
            unsuzSayisi++
        }
    }



}

