package UselessJava.days.Day070

import java.util.*

class Day70K {
    companion object{
        fun bars(height: Int): String {
            val block = '█'
            var start = (Math.random() * 64).toInt()
            var res = ""
            for (i in 0 until height) {
                for (j in 0 until start) {
                    res += block
                }
                res += '\n'
                start += (Math.random() * 10).toInt() - 5
                start = start.coerceAtLeast(1)
                start = start.coerceAtMost(64)
            }
            return res
        }
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a number.")
        try{
            val x = sc.nextInt()
            println(Day70K.bars(
                x.coerceAtLeast(1))
            )
        } catch (e: Exception){
            println("Not a valid number.")
        }
    }
}