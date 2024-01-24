package com.wkc.s2

/**
 * @Author wkc
 * @Date 2024/1/24 13:40
 */

//TODO 28.Kotlin语言的lambda学习

fun main() {
    val addResultMethod={num1:Int,num2:Int->
        "$num1 + $num2 = ${num1+num2}"
    }
    println(addResultMethod(1, 1))
    val weekResultMethod={num:Int->
        when(num){
            1-> "周一"
            2-> "周二"
            3-> "周三"
            4-> "周四"
            5-> "周五"
            6-> "周六"
            7-> "周日"
            else->-1
        }
    }
    println(weekResultMethod(2))
}