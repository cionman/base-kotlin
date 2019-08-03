package com.base.kotlin.kotlinbasic.E_15_함수형_프로그래밍과_람다

//val lambdaFun1 = {x -> x * 10} //에러

//매개변수의 타입 추론을 할 수 있을 때는 타입 선언을 생략할 수 있습니다.
val lambdaFun2: (Int) -> Int = { x -> x + 10}
