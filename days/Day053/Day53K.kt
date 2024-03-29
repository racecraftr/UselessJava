package UselessJava.days.Day053

import java.util.*

class Day53K{
    companion object {
        @JvmStatic val consonants = "wrtypsdfghjklzcvbnm".toCharArray()
        @JvmStatic val vowels = "aeiou".toCharArray()
        @JvmStatic fun makeWord(): String {
            var res = ""
            for (i in 0 until (Math.random() * 10).toInt() + 1) {
                res += getRandomChar(consonants)
                res += getRandomChar(vowels)
                res += getRandomChar(consonants)
            }
            return res
        }

        @JvmStatic fun getRandomChar(chars: CharArray): Char {
            return chars[(Math.random() * chars.size).toInt()]
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    while (true){
        val s = sc.nextLine()
        println(Day53K.makeWord())
    }
}