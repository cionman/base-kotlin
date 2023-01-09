package com.base.kotlin.kotlinbasic.E_09_추상클래스와_인터페이스

/**
 * 코틀린은 다중 상속을 지원하지 않는다, 인터페이스는 여러개 구현할 수 있다
 */

interface MyInterface6{
    fun myFun6()
}
interface  MyInterface7{
    fun myFun7()
}

open class SuperOpen(){

}

class SubClass: SuperOpen(), MyInterface6, MyInterface7{
    override fun myFun6() {
    }

    override fun myFun7() {
    }


}

class SubClass2: MyInterface6, SuperOpen(), MyInterface7{ //순서는 정해져 있지 않다.
    override fun myFun6() {
    }

    override fun myFun7() {
    }
}