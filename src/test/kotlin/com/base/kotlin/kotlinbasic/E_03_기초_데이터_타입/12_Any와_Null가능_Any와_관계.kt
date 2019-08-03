package com.base.kotlin.kotlinbasic.E_03_기초_데이터_타입

// Any -> Any?에 대입이 가능하지만, Any?는  Any에 대입할 수 없다

val myVal1: Any = 10
val myVal2: Any? = myVal1
val myVal3: Any? = 10
// val myVal4: Any = myVal3 // 에러 발생
val myVal5: Any = myVal3 as Any