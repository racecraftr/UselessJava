package UselessJava.Day19

import java.util.*

class Day19K() {
    val moveArray = "U D L R F B x y z M E S u d l r f b".split(" ");
    val addons = " ' 2".split(" ");
    fun createScrambleSequence(moves: Int): String{
        var res = ""
        for (i in 0 until moves){
            res += moveArray[(Math.random() * moveArray.size).toInt()];
            res += addons[(Math.random() * addons.size).toInt()];
            res += " "
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