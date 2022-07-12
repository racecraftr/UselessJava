package UselessJava.days.Day036

import java.util.*

class Day36K {
    fun averageChar (s: String): Char{
        val chars = s.toCharArray()
        var n = 0;
        for (char in chars) {
            n += char.code
        }
        n /= chars.size
        return n.toChar()
    }
}

fun main(){
    val d = Day36K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string.")
        val s = sc.nextLine()
        println(d.averageChar(s))
    }
}