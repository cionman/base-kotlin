package com.base.kotlin.kotlinbasic.E_02_변수와_함수

//변수선언은 최상위 클래스 외부, 클래스 내부, 함수 내부에서 가능하다.
//변수초기화는 함수 내부 이외에는 변수선언과 동시에 해야한다.

//val topData1:Int  // 최상위 - 초기화 되지 않아서 에러

class User{
    //val objData1: String //클래스 내부 - 초기화 되지 않아서 에러

    fun some(){
        val localData1: Int
        var localData2: String

        // print(localData1) // 초기화 되지 않은 변수는 사용할 수 없다
        localData2  = "초기화됨"
        println(localData2)
    }
}