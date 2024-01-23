package com.wkc.s1

/**
 * @Author wkc
 * @Date 2024/1/23 12:28
 */

//TODO 18.Kotlin语言的具名函数参数

private fun loginAction(username:String,userpsd:String,phonenum:String,age:Int){
    println("用户名:${username},密码:${userpsd},电话号码:${phonenum},年龄:${age}")

}
fun main() {
    loginAction(userpsd = "1234", username = "wkc",age=22, phonenum ="114514")
}