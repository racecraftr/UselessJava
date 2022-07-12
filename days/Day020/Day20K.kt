package UselessJava.days.Day020

import java.util.*

class Day20K {
    private val numRegex = "-*\\d*.*\\d+"

    fun strangeCalculator(s: String): String? {
        val d = parseEquation(s)
        return if (java.lang.Double.isNaN(d) || d > 4) {
            "A suffusion of yellow"
        } else java.lang.Double.toString(d)
    }

    private fun parseEquation(s: String): Double {
        var s = s
        s = s.trim { it <= ' ' }
        s = s.replace("[ \\t]".toRegex(), "")
        if (s.matches(Regex("$numRegex\\+$numRegex"))) {
            val strings = s.split("\\+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val d1 = strings[0].toDouble()
            val d2 = strings[1].toDouble()
            return d1 + d2
        }
        if (s.matches(Regex("$numRegex-{1}$numRegex"))) {
            val strings = s.split("-".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val d1 = strings[0].toDouble()
            val d2 = strings[1].toDouble()
            return d1 - d2
        }
        if (s.matches(Regex("$numRegex[*x]$numRegex"))) {
            val strings = s.split("[*x]]".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val d1 = strings[0].toDouble()
            val d2 = strings[1].toDouble()
            return d1 * d2
        }
        if (s.matches(Regex("$numRegex/$numRegex"))) {
            val strings = s.split("/".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val d1 = strings[0].toDouble()
            val d2 = strings[1].toDouble()
            return d1 / d2
        }
        if (s.matches(Regex("$numRegex\\^$numRegex"))) {
            val strings = s.split("\\^".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val d1 = strings[0].toDouble()
            val d2 = strings[1].toDouble()
            return Math.pow(d1, d2)
        }
        return if (s.matches(Regex(numRegex))) {
            s.toDouble()
        } else Double.NaN
    }
}

fun main(args: Array<String>) {
    val d = Day20K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter a number.")
        val s = sc.nextLine()
        println(
            """
                ${d.strangeCalculator(s)}
                
                """.trimIndent()
        )
    }
}