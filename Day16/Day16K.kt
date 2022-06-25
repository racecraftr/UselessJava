package UselessJava.Day16

import java.util.*

class Day16K {
    fun sumOfString(s: String): Long {
        var sum: Long = 0
        val strings = s.split("\\D".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (string in strings) {
            if (string.length > 0) {
                val n = string.toLong()
                sum += n
            }
        }
        return sum
    }
}

fun main(){
    val d = Day16K()
    val sc = Scanner(System.`in`)
    while(true){
        println("Enter a string")
        val s = sc.nextLine();
        println(d.sumOfString(s))
    }
}