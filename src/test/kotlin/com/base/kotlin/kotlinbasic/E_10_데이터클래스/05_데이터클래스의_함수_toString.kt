package com.base.kotlin.kotlinbasic.E_10_데이터클래스

class Product5(val name:String, val price:Int)

data class User5(val name:String, val age:Int)

fun main(args: Array<String>) {
    var product = Product5("kkang", 50)
    println("product: ${product.toString()}")

    var user = User5("kkang", 50)
    println("user: ${user.toString()}")

}