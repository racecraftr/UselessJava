package UselessJava.Day022

import java.util.*

class Day22K {
    fun hackerBackground(length: Long, magnitude: Long): String? {
        var res = ""
        for (i in 0 until length) {
            for (j in 0 until magnitude) {
                res += (Math.random() * 2).toInt()
            }
            res += "\n"
        }
        return res
    }

    fun hackerBackground(s: String): String? {
        var s = s
        s = s.replace("[ \\t]".toRegex(), "")
        if (s.matches(Regex("\\d+,\\d+"))) {
            val strings = s.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val l1 = strings[0].toLong()
            val l2 = strings[1].toLong()
            return hackerBackground(l1, l2)
        }
        return if (s.matches (Regex("\\d+"))) {
            hackerBackground(s.toLong(), 8)
        } else Double.NaN.toString()
    }
}

fun main(){
    val d = Day22K()
    val sc = Scanner(System.`in`)
    while(true){
        println("Enter something idc")
        val s  = sc.nextLine()
        println(d.hackerBackground(s))
    }
}