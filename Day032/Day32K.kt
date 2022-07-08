package UselessJava.Day032

import java.util.*


class Day32K {
    fun weirdSort(s: String): String? {
        val strings = s.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val customStrings = arrayOfNulls<CustomStringK>(strings.size)
        for (i in strings.indices) {
            customStrings[i] = CustomStringK(strings[i])
        }
        Arrays.sort(customStrings)
        return Arrays.toString(customStrings)
    }
}

internal class CustomStringK(var s: String) : Comparable<Any?> {
    var value = 0

    init {
        for (i in 0 until s.length) {
            value += s[i].code
        }
    }

    override operator fun compareTo(other: Any?): Int {
        return value - (other as CustomStringK).value
    }

    override fun toString(): String {
        return s
    }
}

fun main(){
    val d = Day32K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter an array of strings.")
        val s = sc.nextLine()
        println(d.weirdSort(s))
    }
}

