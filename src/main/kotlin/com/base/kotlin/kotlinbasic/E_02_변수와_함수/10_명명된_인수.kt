package com.base.kotlin.kotlinbasic.E_02_변수와_함수

fun sayHello2(name: String = "kkang", no: Int){
    println("Hello!!" + name)
}

fun main(args: Array<String>) {
    //매개변수가 여러개이면 기본값이 적용된 변수를 명확하게 지정해야한다.
    //sayHello2("abc")
    sayHello2(no = 10)
    sayHello2(no = 10, name = "choi")
}
