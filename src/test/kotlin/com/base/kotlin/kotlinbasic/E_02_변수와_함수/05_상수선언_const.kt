package com.base.kotlin.kotlinbasic.E_02_변수와_함수

const val myConst: Int = 10
//const var myConst2: Int = 20 // var는 const가 불가능

class myClass{
    // const 선언은 클래스 외부에서만 가능하다, 클래스 내부도 불가함
    //const val myConst3: Int = 20

    //내부에서 선언하기 위해서는 compainon object를 이용
    companion object{
        const val REQUEST_PICK_IMAGES = 0
    }
}

fun some(){
    //const val myConst4: Int = 40 //함수 내부 불가
}