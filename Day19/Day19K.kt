package UselessJava.Day19

import java.util.*

class Day19K() {
    val moveArray = "U U2 D D2 L L2 R R2 F F2 B B2 U' D' L' R' F' B' x y z M E S r r2 f f2 b b2 r' f' b'".split(" ");
    fun createScrambleSequence(moves: Int): String{
        var res = ""
        for (i in 0 until moves){
            res += moveArray[(Math.random() * moveArray.size).toInt()] + " "
        }
        return res
    }

    fun createScrambleSequence(s: String): String{
        try {
            val moves = s.toInt()
            return createScrambleSequence(moves)
        }
        catch(e: NumberFormatException){
            return Double.NaN.toString();
        }
    }
}

fun main() {
    val d = Day19K()
    val sc = Scanner(System.`in`)
    while(true){
        println("Enter a number.")
        val s = sc.nextLine();
        println(d.createScrambleSequence(s) + "\n")
    }
}