package com.base.kotlin.kotlinbasic.E_12_Sealed클래스

/**
 * sealed 클래스는 enum과 사용목적이 같다.
 * 하나의 상위클래스에서 하위 클래스들의 정의를 제한할 수 있는 방법
 */
sealed class Shape{
    class Circle(val radius: Double): Shape()
    class Rect(val width:Int, val height:Int):Shape()
}
class Triangle(val bottom:Int, val height:Int) : Shape()

fun main(args: Array<String>) {
    val shape1: Shape = Shape.Circle(10.0)
    val shape2: Shape = Triangle(10, 10)
}