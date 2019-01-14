package com.scala.stage4

object SimpleObiectApp {
  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name="haha"
    //val定义的age不能修改
    println(person.name+person.age)
    println(person.eat())
    person.printInfo()

  }

}

class People{
  //定义属性
  var name:String=""
  val age:Int=10
  //class里面才能访问
  private [this] val gender = "male"

  def printInfo(): Unit ={
    println("gender:"+gender)
  }


  //定义方法
  def eat():String={
    name+"eat"
  }

  def train(course:String):Unit={
    println (name+"train")

  }
}
