package UselessJava.Day028

import java.util.*

class Day28K {
    private fun convolutedAddition(x: Long, y: Long): Long {
        var x = x
        var y = y
        while (y != 0L) {
            val temp = x and y
            x = x xor y
            y = temp shl 1
            println("temp = x and y = $temp")
            println("x = x xor y = $x")
            println("y = carry shl 1 = $y")
            println()
        }
        return x
    }

    fun convolutedAddition(s: String): Long {
        var s = s
        s = s.replace("[ \\t,]+".toRegex(), " ")
        val strings = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        return try {
            val l1 = strings[0].toLong()
            val l2 = strings[1].toLong()
            convolutedAddition(l1, l2)
        } catch (e: Exception) {
            println("ERROR: NaN")
            0
        }
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    val d = Day28K()
    while(true){
        println("Enter two numbers.")
        val s: String = sc.nextLine()
        println(d.convolutedAddition(s))
        println()
    }
}