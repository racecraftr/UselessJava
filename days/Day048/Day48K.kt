package UselessJava.days.Day048

import java.util.*
import kotlin.math.sqrt

class Day48K {
    companion object {
        fun brainNum(num: Int): String {
            if (num < 0) return "[]"
            var res = ""

            if (num < 8) {
                for (i in 0 until num) {
                    res += "+"
                }
                res += "."
                return res
            }

            var n1 = 1
            for(i in 1..sqrt(num * 1.0).toInt()){
                if(num % i ==0){
                    n1 = i
                }
            }
            val n2 = num/n1

            for(i in 0 until n1){
               res += "+"
            }
            res += "[>"
            for(i in 0 until n2){
                res += "+"
            }
            return "$res<-]>"
        }

        fun brainNum(s: String): String?{
            return try {
                val n = s.toInt();
                brainNum(n)
            } catch (e: java.lang.Exception){
                null;
            }
        }
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a positive integer")
        val s = sc.nextLine()
        println(Day48K.brainNum(s))
    }
}
