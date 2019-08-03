package com.base.kotlin.kotlinbasic.E_08_상속

/**
 *  open 상속을 허용한다는 의미의 예약어
 */
open class Shape2{
    var x:Int = 0
        set(value) {
            if(value < 0) field = 0
            else field = value
        }
    var y:Int = 0
        set(value){
            if(value < 0) field = 0
            else field = value
        }
    lateinit var name: String
    open fun print(){   /////////// 함수를 오버라이드 하기위해 오버리아드 허용을 의미하는 open 키워드가 필요하다.
        println("$name : location : $x, $y")
    }
}

class Rect2: Shape2(){
    var width : Int = 0
        set(value){
            if(value < 0) field = 0
            else field = value
        }
    var height : Int = 0
        set(value){
            if(value < 0) field = 0
            else field = value
        }

    override fun print() {
        println("$name : location $x, $y... width :$width .... height: $height")
    }
}
class Circle2: Shape2(){
    var r : Int = 0
        set(value){
            if(value < 0) field = 0
            else field = value
        }

    override fun print() {
        println("$name : location $x, $y... radius :$r")
    }
}

fun main(args: Array<String>) {
    val rect = Rect2()
    rect.name = "Rect"
    rect.x = 10
    rect.y = 10
    rect.width = 20
    rect.height = 20
    rect.print()

    val circle = Circle2()
    circle.name = "Circle"
    circle.x = 30
    circle.y = 30
    circle.r = 5
    circle.print()
    
}