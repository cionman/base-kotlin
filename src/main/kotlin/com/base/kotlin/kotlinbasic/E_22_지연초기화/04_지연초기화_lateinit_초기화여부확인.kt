package com.base.kotlin.kotlinbasic.E_22_지연초기화

class `초기화 여부확인` {
    lateinit var text: String
    val textInitialized: Boolean
        get() = this::text.isInitialized

    fun printText() {
        text = "안녕하세요"
        if (this::text.isInitialized) { // text.isInitialized는 외부에서 사용할 수 없음
            println("초기화됨")
            println("text 값은 ${text}")
        } else {
            println("초기화 안됨")
        }
    }
}

fun main() {
    val test = `초기화 여부확인`()
    if (test.textInitialized) {
        test.text = "메롱"
    }
    test.printText()
}