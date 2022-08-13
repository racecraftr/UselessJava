package UselessJava.days.Day068

import java.lang.Math.abs
import java.util.*

class Day68K {
    companion object {
        @JvmStatic fun coinFip(times: Int): String {
            val times = Math.max(times, 1)
            var s = ""
            var heads = 0; var tails = 0;
            for(i in 0 until times){
                if(Math.random() > 0.5){
                    heads ++
                    s += "H"
                } else {
                    tails ++
                    s += "T"
                }
            }
            return "$s\nChance of heads: ${heads * 1.0 / times}" + 
                    "\nChance of tails: ${tails * 1.0 / times}" +
                    "\nFairness: ${1.0 - abs(heads - tails)/(times * 1.0)}"
        }
        @JvmStatic fun coinFlip(s: String): String {
            try{
                val s = s.trim()
                val n = s.toInt()
                return coinFip(n)
            }
            catch (e: Exception){
                return "NaN"
            }
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a number.")
        val s = sc.nextLine()
        println(Day68K.coinFlip(s))
    }
}
