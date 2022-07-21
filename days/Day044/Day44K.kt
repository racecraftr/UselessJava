package UselessJava.days.Day044

import java.util.*
import kotlin.math.abs
import kotlin.math.sqrt

class Day44K {
    fun randomPyTriple(): LongArray{
        val real: Long = (Math.random() * 1000).toInt() + 1L
        val imaginary: Long = (Math.random() * 1000).toInt() + 1L

        val leg1: Long = abs(real * real - imaginary * imaginary)
        val leg2: Long = abs(2 * real * imaginary)
        val hypo: Long =  sqrt((leg1 * leg1 + leg2 * leg2).toDouble()).toLong()
        return longArrayOf(leg1, leg2, hypo)
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