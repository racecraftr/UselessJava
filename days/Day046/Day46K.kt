package UselessJava.days.Day046

import java.util.*

class Day46K {
    fun wordScroll(s: String){
        val window = 5.coerceAtLeast(s.length / 2)
        var start = -1 * window; var end = 0
        while(start <= s.length){
            var shown = s.substring(
                0.coerceAtLeast(start),
                end.coerceAtMost(s.length)
            )
            if(start < 0){
                for(i in 0 until Math.abs(start)){
                    shown = " $shown"
                }
            }
            println(shown)
            start ++
            end ++
            Thread.sleep(300L)
        }
    }
}

fun main(){
    val d = Day46K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string.")
        val s = sc.nextLine()
        d.wordScroll(s)
    }
}