package com.scala.a3

object FunctionApp {
  def main(args: Array[String]): Unit = {
    println(add(2,3))
    //没有入参的函数调用时可以直接写函数名称，括号可省略。
    println(three)
    sayhello
    sayname()
    sayname("lhc")
    println(speed(1,10))
    //改变了传入参数的顺序
    println(speed(time=1,distance = 10))
    println(sum(1,3))
    println(sum1(1,3,4))
    println(sum1(1,3,4,6,7))

  }

  def add(x:Int,y:Int):Int={
    //最后一行是返回值，不需要return
    x+y

  }

  def three()=1+2

  def sayhello():Unit={
    println("hello")

  }

  def sayname(name:String = "PK"):Unit={
    println(name)
  }

  def loadConf(name:String="" ): Unit ={

  }
  def speed(distance:Float,time:Float):Float={
    distance/time
  }
  def sum(a:Int,b:Int):Int={
    a+b
  }

  def sum1(number:Int*)={
    var result=0
    for (number<-number){
      result+=number
    }
    result
  }


}
