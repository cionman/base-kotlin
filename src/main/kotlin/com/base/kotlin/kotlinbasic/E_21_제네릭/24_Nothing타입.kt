package com.base.kotlin.kotlinbasic.E_21_제네릭

/*
 Nothing  타입으로 선언하면 이곳에는 null만 대입할 수 있음
 값이 없다는 것을 명시적으로 표현할 때 사용
 */

fun myFun():Nothing{
    while(true){

    }
}

fun myFun2():Nothing?{
    return null
}

fun myFun3():Nothing{
    throw Exception()
}