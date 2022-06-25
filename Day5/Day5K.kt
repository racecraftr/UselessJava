package UselessJava.Day5

import java.util.*

class Day5K {
    fun leetCoder(s: String): String? {

        var res = s

        res = res.replace("((?i)(ate))".toRegex(), "8")
        res = res.replace("(?i)(\\bdub)".toRegex(), "w")
        res = res.replace("[Ili]".toRegex(), "1")
        res = res.replace("(?i)(too|to)".toRegex(), "2")
        res = res.replace("[Ee]".toRegex(), "3")
        res = res.replace("A".toRegex(), "4")
        res = res.replace("[Ss]".toRegex(), "5")
        res = res.replace("L".toRegex(), "7")
        res = res.replace("g".toRegex(), "9")
        res = res.replace("[Oo]".toRegex(), "0")
        res = res.replace("B".toRegex(), "8")

        return res
    }
}

fun main(){

    val sc = Scanner(System.`in`)
    val d = Day5()

    while (true) {
        println("Enter a string:")
        val s = sc.nextLine()
        println(d.leetCoder(s))
        println()
    }
}