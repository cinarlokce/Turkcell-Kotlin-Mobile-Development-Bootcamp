package com.works.odev_5

fun main(args: Array<String>) {
    println("==============Inheritence a şıkkı==============")
    UseInheritenceClass().explaination()
    println("==============Inheritence b şıkkı==============")

    if(Dog().giveBirthSkill){
        println("Köpekler doğurabilir.")
    }
    if (Dog().breastFeedingSkill){
        println("Köpekler yavrularını sütle besleyebilir.")
    }

}