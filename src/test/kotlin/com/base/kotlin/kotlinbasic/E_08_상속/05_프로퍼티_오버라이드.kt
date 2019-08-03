package com.base.kotlin.kotlinbasic.E_08_상속

open class Super{
    open val name : String = "kkang"
}

/**
 *  1. 상위 클래스의 프로퍼티와 이름 타입이 모두 같아야함
 *  2. 상위 클래스에 val 로 선언된 프로퍼티는 하위에서 val, var로 재정의 가능
 *  3. 상위 클래스에서 var로 선언된 프로퍼티는 하위에서 var로만 재정의가능, val는 불가능
 *  4. 상위에서 null허용으로 선언된 경우 하위에서는 null 불허로 재정의 가능
 *  5. 상위에서 null불허로 선언된경우 하위에 null 허용으로 재정의 불가능
 */
open class Sub: Super(){
    final override val name: String = "mm"
}