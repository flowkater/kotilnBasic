///**
// * Created by flowkater on 2015. 8. 27..
// */
//import com.sun.xml.internal.fastinfoset.util.StringArray
//import java.util.*
//
//
//fun main(args: Array<String>) {
//    println(sum(1,2))
//    println(sum1(5,6))
//
//    printSum(3,4)
//    printSum1(6,7)
//
//    val a: Int = 1
//    val b = 1
//    val c: Int
//    c = 1
//
//    println(a + b + c)
//
//    var x = 5
//    x += 1
//
//    println(max(5,6))
//
//    println(getStringLength("asdasdasd"))
//    println(getStringLength(2))
//
//    val g = Greeter("Tony")
//    g.greet()
//    Greeter("Ryan").greet()
//
//    val t = parseInt("20")
//    val s = parseInt("30")
//
//    if(t != null && s != null){
//        println(t * s)
//    }else {
//        println("One of the arguments isn't Int")
//    }
//
//    val intArr = intArrayOf(1 ,2, 3)
//    val stringArr = arrayOf("Tony","Ryan", "Edward")
//
//    var i = 0
//    while(i < intArr.size())
//        println(intArr[i++])
//
//    for (name in stringArr)
//        println(name)
//
//    for (i in stringArr.indices)
//        println(stringArr[i])
//
//    val array = arrayListOf<String>()
//    array.add("T")
//    array.add("R")
//    array.add("E")
//
//    for (a in 1..5)
//        println(a)
//
//    if (x !in 0..array.size() -1 )
//        println("size: ${array.size()} / x: ${x}")
//
//    if (x in 0..array.size() -1 )
//        println("size: ${array.size()} / x: ${x}")
//
//}
//
//fun parseInt(str: String): Int?{
//    try{
//        return Integer.parseInt(str)
//    }catch(e: NumberFormatException){
//        println("One of the arguments isn't Int")
//    }
//
//    return null
//}
//
//class Greeter(val name: String) {
//    fun greet(){
//        println("Hello ${name}")
//    }
//}
//
//fun sum(a: Int, b: Int) = a + b
//public fun sum1(a:Int, b:Int): Int = a + b
//
//fun printSum(a: Int, b:Int): Unit {
//    println(a + b)
//}
//
//public fun printSum1(a: Int, b: Int): Unit{
//    println(a + b)
//}
//
//fun max(a: Int, b: Int) = if (a > b) a else b
//
//fun getStringLength(obj: Any): Int? {
//    if (obj is String){
//        return obj.length()
//    }
//
//    return null
//
//}