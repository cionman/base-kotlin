package com.base.kotlin.kotlinbasic.E_09_추상클래스와_인터페이스

/**
 * 1. 추상형으로 선언하거나, get(),set()  함수를 정의 해야한다.
 * 2. 추상프로퍼티가 아니라면 val은 get() 함수를 꼭 선언해야한다.
 * 3. 추상프로퍼티가 아니라면 var는  get() set() 함수를 선언해야한다.
 * 4. 인터페이스의 프로퍼티를 위한 get, set 함수에서는 field를 사용할 수 없다.
 */
interface MyInterface8{
    var prop1: Int // 추상형이 된다.

    // val prop2: String = "kkang" // 에러,  val는 get을 구현해야한다.

/*    val prop2: String
        get()= field*/ //field를 사용할 수 없다.

    /*var prop3: String
        get() = "kkang"*/ //var는 set get을 모두 구현해야한다.

    val prop4:String
        get() = "kkang"

    var prop5:String
        get() = "kkang"
        set(value){

        }
}