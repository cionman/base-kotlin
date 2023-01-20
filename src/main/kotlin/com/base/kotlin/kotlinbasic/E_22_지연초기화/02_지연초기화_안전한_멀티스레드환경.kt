package com.base.kotlin.kotlinbasic.E_22_지연초기화

class HelloBot2 {
    val greeting: String by lazy(
        /*LazyThreadSafetyMode.NONE*/ // 쓰레드 세이프를 끄고 테스트 해볼 수 있다.
    ) {
        println("지연초기화")
        getHello()
    }

    fun sayHello() = println(greeting)
}

fun getHello2() = "안녕하세요."

fun main() {
    val helloBot = HelloBot2()
    for (i in 1..5) {
        // 안전한 멀티 스레드 환경, 지연초기화 한번만 됨
        Thread {
            helloBot.sayHello()
        }.start()
    }
}