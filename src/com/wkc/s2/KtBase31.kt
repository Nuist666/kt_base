package com.wkc.s2

/**
 * @Author wkc
 * @Date 2024/1/30 13:39
 */

//TODO 31.Kotlin语言的函数内联学习

fun main(){

    doLogin("wkc","114514",{responseMsg:String,responseCode:Int->
        println("服务器响应结果：responseMsg $responseMsg,responseCode $responseCode")
    })
    doLogin("wkc2","11514"){responseMsg:String,responseCode:Int->
        println("服务器响应结果：responseMsg $responseMsg,responseCode $responseCode")
    }
}


private const val DB_SAVE_USER_NAME="wkc"
private const val DB_SAVE_USER_PWD="114514"

//内联函数对lambda代码块进行优化，进行替换操作，减少调用栈
private inline fun doLogin(userName:String,userPwd:String,serverResponse:(String,Int)->Unit){

    if(DB_SAVE_USER_NAME==userName && DB_SAVE_USER_PWD==userPwd){
        //业务逻辑
        val serverResponseResult="登录成功"
        serverResponse(serverResponseResult,200)
    }
    else{
        //业务逻辑
        val serverResponseResult="登录失败"
        serverResponse(serverResponseResult,404)
    }
}