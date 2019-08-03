package com.base.kotlin.kotlinbasic.E_20_클래스확장

open class Super1{
    open fun superFun(){
        println("Super... superFun.....")
    }
}

class Sub1:Super1(){
    var data:Int = 20
    override fun superFun() {
        println("Sub ... superFun .... ${data}")
    }

    fun some1(data: Int){
        this.data=data
        superFun()
        super.superFun()
    }
}

fun Sub1.some2(data:Int){
    this.data = data
    superFun()
    // super.superFun() // 에러 발생, 확장한 클래스 타입만 인식할 수 있으며 동적으로 상위 클래스를 판단할 수는 없습니다.
}

fun main(args: Array<String>) {
    val obj:Sub1 = Sub1()
    obj.some1(10)
    obj.some2(100)
}