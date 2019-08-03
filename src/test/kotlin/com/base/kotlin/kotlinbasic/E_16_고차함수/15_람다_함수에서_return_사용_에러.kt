package com.base.kotlin.kotlinbasic.E_16_고차함수


fun inlineTest1(argFun: (x:Int, y:Int) -> Int):Int{
    return argFun(10, 0)
}

inline fun inlineTest2(argFun: (x:Int, y:Int) -> Int):Int{
    return argFun(10, 0)
}

fun callFun1(){
    println("callFun .. top")
    val result = inlineTest1 { x, y ->
        //if(y <= 0) return // 람다 함수에서 return 에러
        x/y
    }
}

fun callFun2(){
    println("callFun .. top")
    val result = inlineTest2 { x, y ->
        if(y <= 0) return // inline 키워드의 람다함수 내에서는 사용할 수 있다.
        x/y
    }
}



