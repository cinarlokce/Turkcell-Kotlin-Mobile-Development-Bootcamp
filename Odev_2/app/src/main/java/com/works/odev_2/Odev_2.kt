package com.works.odev_2

import java.lang.NullPointerException
import java.lang.NumberFormatException
import java.util.InputMismatchException
import java.util.Scanner
import kotlin.math.sqrt


fun main(args: Array<String>) {
    println(isPrime(9))
    println(rangeSum(3,6))
    println(oddEvenRemainder(5,4))
    println(digitSum(123456789))
    println(bodyMassIndex(110.0,1.85))
    println(reverseInt(321))
    println(isPalindrome(4321234))
    println(arrayMinMax(intArrayOf(9,6,2,7,5,1,3,4,2)))
    println(arraySearch(intArrayOf(3,4,2,1,5,7), 9))
    println(findMax(1,7,4,1))
    println(arrayComparison(intArrayOf(3,6,4,5,2), intArrayOf(1,2,3)))
    divideZero()
    valuePrint()
    println("Divide function 3/0 : ${divide(3, 0)}")
    average()
    stringComparison()
    println(stringToInt())
    multipler()
    fourDigit()
    oddEven()
    listCreate()
    isPerfect()
}

    // 1-)

fun isPrime(n: Int) : Boolean {
    var result = true
    if (n <= 1){
        result = false
    }
    for (i in 2 until n){
        if (n % i == 0){
            result = false
        }
    }
    return result
}

// 2-)

fun rangeSum(a: Int, b:Int) :Int{
    var total = 0
    for (i in (a+1)..b){
        total += i
    }
    return total
}

// 3-)
fun oddEvenRemainder(n1: Int, n2: Int): Double {
    val result: Double = if (n1 % 2 == 0){
        n1.toDouble()%n2
    }else{
        n1.toDouble()/n2
    }
    return result
}

// 4-)
fun digitSum(a: Long): Int {
    var total = 0
    val temp = a.toString()
    for ( i in temp ){
        total += i.digitToInt()
    }
    return total
}

// 5-)
fun bodyMassIndex(kg: Double, boy: Double): Double {
    return kg / (boy*boy)
}

// 6-)
fun reverseInt(a: Int): Int{
    return a.toString().reversed().toInt()

}

// 7-)
fun isPalindrome(n: Int): Boolean {
    val nReversed = n.toString().reversed().toInt()
    return n == nReversed
}

// 8-)
fun arrayMinMax(arr: IntArray) :Int {
    return arr.min()+arr.max()
}

// 9-)
fun arraySearch(arr: IntArray, n: Int): Boolean{
    arr.forEach {
        if ( it == n ){
            return true
        }
    }
    return false
}

// 10-)
fun findMax(a: Int, b: Int, c: Int, d: Int): Int{
    val arr = intArrayOf(a,b,c,d)
    var maks = 0

    for (i in arr){
        if (i> maks){
            maks = i
        }
    }
    return maks
}

// 11-)
fun arrayComparison(arr1: IntArray, arr2: IntArray) : Int{
    var sayac = 0
    arr1.forEach {
        if(arraySearch(arr2, it)){
            sayac++
        }
    }
    return sayac
}

// 12-)
fun divideZero() {
    try {
        println("Lütfen integer bir değer giriniz: ")
        val a = readLine()?.toInt()
        if (a != null) {
            println(a / 0)
        }
    } catch (ex: NumberFormatException) {
        println("Geçersiz değer girdiniz.")
        divideZero()
    } catch (ex: NullPointerException) {
        println("Geçersiz değer girdiniz.Null")
        divideZero()
    } catch (ex: ArithmeticException) {
        println("Sayı sıfıra bölünemez.")
    }
}

// 13-)
fun valuePrint(){
    var sc = Scanner(System.`in`)
    try {
        println("Lütfen bir tamsayı giriniz: ")
        var a = sc.nextInt()
        println("Girdiğiniz sayı $a")
    }catch (ex: InputMismatchException){
        valuePrint()
    }
}

// 14-)
fun divide(a: Int, b: Int): Any {
    try {
        return a/b
    }catch (ex: ArithmeticException){
        return "Bölme işlemi sıfıra bölünemez."
    }
}

// 15-)
fun average() {
    var sc = Scanner(System.`in`)
    try {
        println("Lütfen ortalama hesaplaması için 1. sayıyı giriniz: ")
        var a = sc.nextInt()
        println("Lütfen ortalama hesaplaması için 2. sayıyı giriniz: ")
        var b = sc.nextInt()
        println("Girdiğiniz sayıların ortalaması: ${(a.toFloat()+b.toFloat())/2}")
    }catch (ex: InputMismatchException){
        println("Lütfen değerleri tamsayı giriniz.")
        average()
    }
}

// 16-)
fun stringComparison(){
    var sc = Scanner(System.`in`)
    try {
        println("1. String ifadeyi giriniz.")
        var a = readLine()
        println("2. String ifadeyi giriniz.")
        var b = readLine()
        if (a?.length != b?.length) println("Karakter sayıları uyuşmuyor.")
    }catch (ex: InputMismatchException){
        println("Lütfen String ifade giriniz")
    }
}

// 17-)
fun stringToInt(): Int?{
    try {
        println("Lütfen bir tamsayı giriniz.")
        var a = readLine()
        var aInt = a?.toInt()
        return aInt
    }catch (ex: NullPointerException){
        println("Geçerli bir değer giriniz.")
        stringToInt()
    }catch (ex: NumberFormatException){
        println("Geçerli bir değer giriniz.")
        stringToInt()
    }
    return 0
}

// 18-)
fun multipler(){
    var sc = Scanner(System.`in`)
    try {
        println("Çarpılacak 1. sayıyı giriniz: ")
        var a = sc.nextInt()
        println("Çarpılacak 2. sayıyı giriniz: ")
        var b = sc.nextInt()
        println("Girdiğiniz iki sayının çarpımı: ${a*b}")
    }catch (ex: InputMismatchException){
        println("Lütfen değerleri tamsayı giriniz.")
        multipler()
    }
}

// 19-)
fun fourDigit(){
    try {
        var sc = Scanner(System.`in`)
        println("Lütfen dört basamaklı bir sayı giriniz.")
        var n1 = sc.nextInt()
        if ( n1.toString().length == 4 ){
            if ( n1 % 2 == 0 ){
                println("$n1 sayısının ikiye bölümü: ${n1/2}")
            }else{
                throw ArithmeticException("Sayı ikiye bölünemiyor.")
            }
        }else{
            fourDigit()
        }
    }catch (ex: ArithmeticException){
        println(ex.message)
        fourDigit()
    }catch (ex: InputMismatchException){
        println("Geçersiz değer girdiniz lütfen tamsayı bir değer giriniz.")
        println("")
    }
}

// 20-)
fun oddEven(){
    var arr = mutableListOf<Int>()
    var sc = Scanner(System.`in`)
    try {
        println("0 ile 20 arasında 5 adet tamsayı giriniz.")
        for (i in 1..5) {
            println("$i. sayı: ")
            var sayi = sc.nextInt()
            if ( sayi>20 && sayi<0){
                throw IndexOutOfBoundsException("Lütfen 0 ile 20 arasında bir değer giriniz.")
            }
            arr.add(sayi)
        }
        var evenArr = arr.filter { it % 2 == 0 }
        var oddArr = arr.filter { it % 2 != 0 }
        var evenCount = arr.count { it % 2 == 0 }
        var oddCount = arr.count { it % 2 != 0 }

        var evenAvg = evenArr.sum()/evenCount
        var oddAvg = oddArr.sum()/oddCount

        println("""
            Girdiğiniz tek sayıların ortalaması: $oddAvg
            Girdiğiniz çift sayıların ortalaması: $evenAvg
        """.trimIndent())

    }catch (ex: InputMismatchException){
        println("Geçersiz değer girdiniz.Lütfen tamsayı değer giriniz.")
        oddEven()
    }catch (ex: IndexOutOfBoundsException){
        println(ex.message)
        oddEven()
    }
}

// 21-)
fun listCreate(){
    var sc = Scanner(System.`in`)
    var liste = mutableListOf<Int>()
    try {
        println("Lütfen oluşturmak istediğiniz listenin boyutunu giriniz")
        var elemanSayisi = sc.nextInt()
        for (i in 0..elemanSayisi){
            println("Lütfen ${i+1}. elemanı giriniz: ")
            var eleman = sc.nextInt()
            liste.add(eleman)
        }
        var listeCiftIndex = liste.filter { liste.indexOf(it)%2 == 0 }
        var listeTekIndex = liste.filter { liste.indexOf(it)%2 != 0 }

        println("""
            Girdiğiniz listedeki;
            Çift indexli elemanların toplamı: ${listeCiftIndex.sum()}
            Tek indexli elemanların toplamı: ${listeTekIndex.sum()}
        """.trimIndent())
    }catch (ex: InputMismatchException){
        println("Boyutu veya elemanları geçersiz girdiniz.Lütfen tamsayı değerler giriniz.")
        listCreate()
    }
}

// 22-)
fun isPerfect(){
    val sc = Scanner(System.`in`)
    var posDivider = mutableListOf<Int>()
    try {
        print("Mükemmel sayı olup olmadığını kontrol etmek istediğiniz sayıyı giriniz: ")
        val sayi = sc.nextInt()
        for (i in 1 until sayi){
            if ( sayi%i == 0 ){
                posDivider.add(i)
            }else{
                continue
            }
        }
        if ( sayi == posDivider.sum() ){
            println("$sayi sayısı mükemmel sayıdır.")
        }else{
            println("$sayi sayısı mükemmel sayı değildir.")
        }
    }catch (ex: InputMismatchException){
        println("Geçersiz değer girdiniz lütfen tamsayı değer giriniz.")
        isPerfect()
    }
}

// 23-)
fun squareRoot(){
    var sc = Scanner(System.`in`)
    try {
        print("Karekökünü almak istediğiniz sayıyı girin: ")
        var n = sc.nextInt()
        if ( n<0 ){
            throw ArithmeticException("Sayı negatif olamaz!")
        }else{
            println("$n sayısının karekökü ${sqrt(n.toFloat())}")
        }

    }catch (ex: InputMismatchException){
        println("Lütfen tamsayı değer giriniz.")
        squareRoot()
    }catch (ex: ArithmeticException){
        println(ex.message)
        squareRoot()
    }
}
