package com.base.kotlin.kotlinbasic.E_07_프로퍼티

import kotlin.properties.Delegates

class User9{
    var name: String by Delegates.observable("nonValue", {property, oldValue, newValue ->
        println("old: $oldValue ... new : $newValue")
    })
}

fun main(args: Array<String>) {
    val user = User9()
    println("first print : ${user.name}")
    user.name = "kkang"
    user.name= "kim"
    println("last print : ${user.name}")
}