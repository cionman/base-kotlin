package com.base.kotlin.kotlinbasic.E_16_고차함수


/*
고차 함수 호출이 빈번하여 성능에 영향을 미칠 때 inline 함수가 대안이 됨
인라인 함수는 함수 선언앞에 inline 예약어를 추가한 함수
 */

inline fun hoFunTest(argFun: (x1:Int, x2:Int) -> Int){
    argFun(10, 20)
}

fun main(args: Array<String>) {
    hoFunTest { x1, x2 -> x1 + x2}
}




