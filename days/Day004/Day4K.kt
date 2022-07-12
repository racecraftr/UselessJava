package UselessJava.days.Day004

import java.util.*

class Day4K {
    fun aggressiveEcho(s: String): String{
        val chars = s.lowercase().toCharArray()
        for (i in chars.indices){
            if(i % 2 == 1 && chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i]  = chars.get(i) - 32;
            }
        }
        return chars.joinToString("")
    }
}

fun main(){
    val d = Day4K()
    val sc = Scanner(System.`in`);
    while(true){
        println("What did you just say to me?")
        val s = sc.nextLine();
        println(d.aggressiveEcho(s));
        println()
    }
}