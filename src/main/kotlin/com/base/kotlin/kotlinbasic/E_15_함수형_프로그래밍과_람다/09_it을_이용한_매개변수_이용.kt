package com.base.kotlin.kotlinbasic.E_15_함수형_프로그래밍과_람다

val lambdaFun3: (Int) -> Int = { x -> x + 10}
val lambdaFun4: (Int) -> Int = { it + 10} //  람다 함수를 정의할 때 매개변수가 하나일 때는 별도의 매개변수를 선언하지 않고 함수에서 it으로 매개변수를 지칭할 수 있습니다.

