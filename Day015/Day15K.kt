package UselessJava.Day015

import java.util.*

class Day15K {
    fun hasHiddenRickRoll(s: String): Boolean {
        val test = s.replace("[ \\t\\n]".toRegex(), "")
        val rickroll = "nevergonnagiveyouup"
        var regex = ".*"
        for (i in 0 until rickroll.length) {
            regex += rickroll[i].toString() + ".*"
        }
        return test.lowercase(Locale.getDefault()).matches(Regex(regex))
    }
}

fun main(){
    val d = Day15K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter a string lol")
        val s = sc.nextLine()
        if (d.hasHiddenRickRoll(s)) {
            println("there is a rickroll, be careful")
        } else {
            println("no rickroll, you are safe for now")
        }
    }
}