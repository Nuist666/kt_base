package com.wkc.s1

/**
 * @Author wkc
 * @Date 2024/1/22 15:43
 */

//TODO 13.Kotlin语言的range表达式

fun main() {
    print("请输入分数：")

    try {
        val input = readLine()
        val num = input?.toInt() ?: 0

        if (num in 0 until 60)
            println("差")
        else if (num in 60 until 70)
            println("中")
        else if (num in 70 until 80)
            println("良")
        else if (num in 80..100)
            println("优")
        else
            println("成绩不在范围内")
    } catch (e: NumberFormatException) {
        println("输入无效，请输入一个整数。")
    }
}

