package UselessJava.days.Day051

import java.util.*

class Day51K{
    companion object{
        private fun shuffle (s: String): String{
            val chars = s.toCharArray()
            for(i in chars.indices){
                val i1 = (Math.random() * chars.size).toInt()
                val i2 = (Math.random() * chars.size).toInt()

                val temp = chars[i1]
                chars[i1] = chars[i2]
                chars[i2] = temp
            }
            return String(chars)
        }

        fun kindaSorta(s: String): String{
            val strings = s.split(Regex("[ \t]"))
            var res = ""
            for(string in strings){
                res += if(string.length <= 3){
                    "$string "
                } else {
                    val shuffled = string[0] + shuffle(string.substring(1, string.length - 1)) + string[string.length - 1]
                    "$shuffled "
                }
            }
            return res
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string")
        val s = sc.nextLine();
        println(Day51K.kindaSorta(s))
    }
}