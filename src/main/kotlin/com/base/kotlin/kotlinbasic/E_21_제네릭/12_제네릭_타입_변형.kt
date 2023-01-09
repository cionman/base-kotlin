package com.base.kotlin.kotlinbasic.E_21_제네릭

open class Super2{
    open fun sayHello(){
        println("i am super sayHello")
    }
}

class Sub2:Super2(){
    override fun sayHello() {
        println("i am sub sayHello")
    }

    fun sayGoodBye(){
        println("i am sub sayGoodBye")
    }
}

class MyClass12<T>

fun main(args: Array<String>) {
    val obj = MyClass12<Sub2>()
    //val obj2: MyClass12<Super2> = obj // 에러 발생, MyClass12<Sub2> 는 MyClass12<Super2>의 하위 클래스가 아니다.

    /*
    MyClass12<Sub2> 는 MyClass12<Super2>에 대입 하려면 특별한 처리를 해주어야함, 이를 Variance(공변) 이라함
    기본으로는 사용할 수 없으므로 invariance(무공변) 이라함
     */

}