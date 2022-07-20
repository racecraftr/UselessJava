package UselessJava.days.Day044

import java.util.*
import kotlin.math.abs
import kotlin.math.sqrt

class Day44K {
    fun randomPyTriple(): IntArray{
        val real = (Math.random() * 1000).toInt() + 1
        val imaginary = (Math.random() * 1000).toInt() + 1

        val leg1 = abs(real * real - imaginary * imaginary)
        val leg2 = abs(2 * real * imaginary)
        val hypo =  sqrt((leg1 * leg1 + leg2 * leg2).toDouble()).toInt()
        return intArrayOf(leg1, leg2, hypo)
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    val d = Day44K()
    while (true){
        println("Press enter/return.")
        val s = sc.nextLine()
        println(d.randomPyTriple().contentToString())
    }
}