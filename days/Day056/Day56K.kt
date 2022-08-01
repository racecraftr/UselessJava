package UselessJava.days.Day056

import java.util.*

class Day56K {
    companion object{
        @JvmStatic fun snakeTalk (s: String): String {
            var res = s
            res = res.replace("s+".toRegex(), loop())
            res = res.replace("x+".toRegex(), "k${loop()}")
            res = res.replace(" ".toRegex(), "_")
            return res
        }

        private fun loop(): String {
            var res = ""
            for (i in 0 until (Math.random() * 15).toInt() + 5) {
                res += 's'
            }
            return res
        }
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string.")
        val s = sc.nextLine();
        println(Day56K.snakeTalk(s))
    }
}