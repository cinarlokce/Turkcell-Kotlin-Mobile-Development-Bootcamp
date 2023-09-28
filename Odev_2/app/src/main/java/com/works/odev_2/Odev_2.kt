package com.works.odev_2

import kotlin.math.sqrt

fun main(args: Array<String>) {
    println(isPrime(9))
    println(rangeSum(3,6))
    println(oddEvenRemainder(5,4))
    println(digitSum(123456789))
    println(bodyMassIndex(110.0,1.85))
    println(reverseInt(321))
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
    var temp = a.toString().reversed()
    return temp.toInt()
}

// 7-)
fun isPalindrome(n: Int): Boolean {
    
}
