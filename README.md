## 一、初识Scala
#### 1.Scala安装（2.11.8）
1)jdk8

2)下载Scala

bin
doc
lib
man

## 二、Scala入门
#### 1.val和var
val:值 
var:变量
#### 2.Scala基本数据类型
Short/Int/Long/Floar
Boolean
asInstanceof
isInstanceof
#### 3.lazy在Scala中的应用
lazyz
#### 4.Scala开发工具

## 三、函数
#### 1.定义

~~~
def 方法名(参数名:参数类型):返回值类型 = {
    //括号内的是方法体
    
    //最后一行是返回值
    
}
~~~


#### 2.默认参数的使用
在函数定义时，允许指定默认的参数

#### 3.命名参数的使用（少用）
在函数使用时，可以不按命名顺序传值，使用名字就可以

#### 4.可变参数
JDK5+：可变参数
~~~
def 
~~~

#### 5.条件表达式

#### 6.循环表达式
to 左闭右闭
~~~
//下面两种写法等价
1  to 10
1.to(10)
~~~
Range 左闭右开
~~~
Range(1,10)
Range(1,10,2)
~~~

until 

## 四、对象
#### 1.oo概述
封装：属性、方法封装到类中

继承：父类和子类之间的关系

多态：父类引用指向子类对象（oo精髓）

#### 2.占位符
~~~
var a:Double = _
~~~
不能使用val