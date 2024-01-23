package com.wkc.s1

/**
 * @Author wkc
 * @Date 2024/1/23 12:54
 */

//TODO 20.Kotlin语言的Nothing类型特点

private fun show(number: Int){
    when(number){
        !in 0..100 -> TODO("分数无效")
        in 0 until 60 -> println("不及格")
        in 60 until 70 -> println("中")
        in 70 until 80 -> println("良")
        in 80..100 -> println("优")
    }
}
fun main() {
    show(99)
}

interface A{
    fun show()
}
class AImpl:A{
    override fun show() {
        TODO("Not yet implemented")
    }
}