package com.base.kotlin.kotlinbasic.E_14_Object클래스

class NormalClass{
    fun myFun(){

    }
}

object ObjectClass{
    fun myFun(){
        println("명시적인 Object클래스 사용")
    }
}

fun main(args:Array<String>){
    val obj1:NormalClass = NormalClass()
    val obj2:NormalClass = NormalClass()
    obj1.myFun()

    //val obj3: ObjectClass = ObjectClass() //에러 발생
    ObjectClass.myFun() //선언과 동시에 클래스명과 같은 이름의 객체가 생성, object 클래스를 싱글톤 클래스로 이용함

}