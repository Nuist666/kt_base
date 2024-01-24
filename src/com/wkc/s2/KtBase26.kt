package com.wkc.s2

/**
 * @Author wkc
 * @Date 2024/1/23 15:20
 */

//TODO 26.Kotlin语言的it关键字特点

fun main() {
    val methodAction:(Int,Int,Int)->String={
        n1,n2,n3->
        val num=114514
        println("$num Nuist,n1:$n1,n2:$n2,n3:$n3")
        ""
    }
    val methodAction2:(String)->String={
        "$it Nuist2"
    }
    val methodAction3:(Double)->String={
        "$it Nuist3"
    }
    methodAction(1,2,3)
    println(methodAction2("wkc"))
    println(methodAction3(114.514))
}