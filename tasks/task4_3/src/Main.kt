// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess
fun main(args:Array<String>){

if (args.size != 3){
    println("ERROR")
    exitProcess(1)
}


val a = args[0].toDouble()
val b = args[0].toDouble()
val c = args[0].toDouble()
val average =(a+b+c) / 3.0
val roundedaverage = average.roundToInt()

when(roundedaverage){
    in 0..39 -> println("Fail")
    in 40..69 -> println("Pass")
    in 70..100 -> println(" Distinction")
    else -> println("?")
     }
}