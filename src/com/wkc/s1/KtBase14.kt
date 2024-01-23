package com.wkc.s1

/**
 * @Author wkc
 * @Date 2024/1/22 16:41
 */

//TODO 14.Kotlin语言的when表达式
fun main() {
    val week=5
    val info=when(week){
        1->"周一"
        2->"周二"
        3->"周三"
        4->"周四"
        5->"周五"
        6->"周六"
        7->"周日"
        else->{
            println("error")
        }
            
    }
    println(info)
}