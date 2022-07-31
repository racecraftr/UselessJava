package UselessJava.days.Day055

import java.util.*

class Day55K{
    companion object{
        @JvmStatic val pieces = " r k b K Q".split(" ")

        private fun randomChessMoves(moves: Int): String {
            var moves = moves
            moves = Math.max(1, moves)
            var res = ""
            for (i in 0 until moves) {
                res += """
            ${generateRandomMove()}
            
            """.trimIndent()
            }
            return res
        }

        fun randomChessMoves(s: String): String {
            return try {
                val moves = s.toInt()
                randomChessMoves(moves)
            } catch (e: NumberFormatException) {
                "Not a valid number"
            }
        }

        private fun generateRandomMove(): String {
            var res = ""
            res += Day55.pieces[(Math.random() * Day55.pieces.size).toInt()]
            if (Math.random() <= 0.5) {
                if (res == "") res += ((Math.random() * 8).toInt() + 'a'.code).toChar()
                res += "x"
            }
            res += ((Math.random() * 8).toInt() + 'a'.code).toChar()
            res += (Math.random() * 8 + 1).toInt()
            if (Math.random() <= 0.05) res = "O-O"
            if (Math.random() <= 0.1) res = "O-O-O"
            if (Math.random() <= 0.25) res += "+"
            return res
        }
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a number.")
        val s = sc.nextLine();
        println(Day55K.randomChessMoves(s))
    }
}