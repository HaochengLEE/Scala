package com.scala.a3

object FunctionApp {
  def main(args: Array[String]): Unit = {
    println(add(2,3))
    //没有入参的函数调用时可以直接写函数名称，括号可省略。
    println(three)
  }

  def add(x:Int,y:Int):Int={
    //最后一行是返回值，不需要return
    x+y

  }

  def three()=1+2

}
