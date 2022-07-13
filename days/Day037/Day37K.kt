package UselessJava.days.Day037

import java.util.*

class Day37K {
    fun bruteForce(s: String) {
        val chars = s.toCharArray()
        var res = ""
        for (c in chars) {
            var n = ' '.code
            while (n != c.code){
                println(res + n.toChar())
                n++
                Thread.sleep(10);
            }
            println(res + c);
            res += c;
        }
        return
    }
}

fun main(){
    val d = Day37K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string")
        val s = sc.nextLine()
        d.bruteForce(s)
    }
}