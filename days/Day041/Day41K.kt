package UselessJava.days.Day041

import java.util.*

class Day41K {
    fun toUnicode(s: String): String{
        var res = ""
        for(i in s.indices){
            val n  = s[i]
            res += "U+${String.format("%04x", n).uppercase()}"
            if((i + 1) % 10 == 0){
                res += "\n"
            }
        }
        return res
    }
}

fun main(){
    val d = Day41K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string: ")
        val s = sc.nextLine();
        println(d.toUnicode(s) + "\n")
    }
}