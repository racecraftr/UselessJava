package UselessJava.Day030

import java.util.*

class Day30K {
    fun redditChain(message: String): String? {
        var message = message
        if (message == ":moai:") message = "\uD83D\uDDFF"
        var prefix = ""
        var res = ""
        var points = 1000 + (Math.random() * 9000).toInt()
        for (i in 0 until (Math.random() * 200).toInt()) {
            res += "$prefix$message [+$points]\n"
            prefix += "|\t"
            points -= (Math.random() * points).toInt()
            points = Math.max(points, 1)
        }
        return res
    }
}

//@JvmStatic is not working :(
fun main() {
    val sc = Scanner(System.`in`)
    val d = Day30K()
    while (true) {
        println("Enter a string")
        val s = sc.nextLine()
        println(d.redditChain(s))
    }
}