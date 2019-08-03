package com.base.kotlin.kotlinbasic.E_10_데이터클래스

class Product(val name:String, val price:Int)

data class User1(val name: String, val age:Int)

data class User2(val name: String, val age:Int){
    var email:String = "test@test.com"
}

fun main(args: Array<String>) {
    var product1 = Product("prod1", 100)
    var product2 = Product("prod1", 100)

    println(product1.equals(product2)) // false 반환

    var user1 = User1("kkang", 30)
    var user2 = User1("kkang", 30)

    println(user1.equals(user2)) // 데이터의 값을 비교함을 보여줌 true 반환

    var user3 = User2("kkang", 30)
    var user4 = User2("kkang", 30) // 프로퍼티 값이 달라도 주생성자의 값만 같으면
    user3.email = "abc@abc.com"

    println(user3.equals(user4))
}