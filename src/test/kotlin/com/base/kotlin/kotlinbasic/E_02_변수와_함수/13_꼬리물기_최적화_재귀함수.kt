package com.base.kotlin.kotlinbasic.E_02_변수와_함수


/**
 * 일반적으로 재귀함수를 잘못 작성하면 무한 루프에 빠지면서 Stackoverflow가 발생하는데, tailrec 키워드를 사용하면 java로 변환될때 일반적인 for문으로 반환하므로 그런일을 방지해줍니다.
 */
tailrec fun tailrecPrint(no: Int = 1, count: Int = 1){
    println("tailrecPrint ...")
    return if(no == count) return else tailrecPrint(no - 1, count)
}

fun main(args: Array<String>) {
    tailrecPrint(3)
}