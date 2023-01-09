package com.base.kotlin.kotlinbasic.E_08_상속

class PropertyVisibilityTest{

    var data: Int = 10
        private set(value){
            field = value
        }
}

fun main(args: Array<String>) {
    val obj2 = PropertyVisibilityTest()
    println("${obj2.data}")
    // obj2.data = 20  // setter가 private이기 때문에 에러 발생함
}
