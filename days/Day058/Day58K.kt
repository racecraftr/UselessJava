package UselessJava.days.Day058

import java.util.*

class Day58K {
    companion object{

        @JvmStatic val words: Array<String> = Day58.words

        @JvmStatic fun nervous(s: String): String{
            var res = ""
            val strings = s.split("[ \t]".toRegex())

            for(string: String in strings) {
                for(i in 0 until (Math.random() * 12).toInt()){
                    res += "${words[(Math.random() * words.size).toInt()]} "
                }
                res += "$string "
            }
            for(i in 0 until (Math.random() * 12).toInt()){
                res += "${words[(Math.random() * words.size).toInt()]} "
            }
            return res
        }
    }
}

fun main () {
    val sc = Scanner(System.`in`)
    while (true){
        println("Ok um enter a string and um I will try to say it um ok yeah thanks")
        val s = sc.nextLine()
        println(Day58K.nervous(s))
    }
}