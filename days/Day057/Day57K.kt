package UselessJava.days.Day057

import java.util.*

class Day57K{
    companion object{
        @JvmStatic val faces = Day57.faces
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    var input: String
    do{
        println("Would you like to have a staring contest? (y/n)")
        input = sc.nextLine()
        println()
        for (i in 0 until (Math.random() * 20).toInt() + 5) {
            println(Day57K.faces[(Math.random() * Day57K.faces.size).toInt()])
            Thread.sleep((Math.random() * 2000).toLong() + 50)
        }
        println("\nOk, you win.")
    } while(input.lowercase() != "n")
}