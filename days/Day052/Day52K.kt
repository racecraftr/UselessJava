package UselessJava.days.Day052

import java.util.*

class Day52K{
    companion object{
        fun minUnoCards(points: Int): String {

            if (points <= 0) return "none";

            var n = points;
            var res = "You need: \n"

            val fifties = n/50
            n %= 50
            if(fifties > 0) res += "$fifties wilds/+4s\n"

            val twenties = n/20
            n %= 20
            if(twenties > 0) res += "$twenties +2s/reverses/skipsn\n"

            for (i in 9 downTo 1){
                val x = n/i
                n %= i
                if(x > 0) res += "$x ${i}s\n"
            }
            return res
        }

        fun minUnoCards(s: String): String{
            try{
                val x = s.toInt()
                return minUnoCards(x)
            } catch (e: java.lang.NumberFormatException){
                return "Not a valid number"
            }
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a positive integer.")
        val s = sc.nextLine()
        println(Day52K.minUnoCards(s))
    }
}