package com.works.odev_2

import kotlin.math.max
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
    println(arrayComparison(intArrayOf(3,2,6,5), intArrayOf(1,2,3,4)))
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
    var result: Double = if (n1 % 2 == 0){
        n1.toDouble()%n2
    }else{
        n1.toDouble()/n2
    }
    return result
}

// 4-)
fun digitSum(a: Long): Int {
    var total = 0
    var temp = a.toString()
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
    var nReversed = n.toString().reversed().toInt()
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
    var arr = intArrayOf(a,b,c,d)
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

