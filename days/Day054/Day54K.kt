package UselessJava.days.Day054

import java.util.*

class Day54K{
    companion object {
        @JvmStatic fun catOverKeyboard(s: String): String {
            //a cat does a cat thing
            var res = s.substring(0, s.length - (Math.random() * s.length/2).toInt())
            for (i in 0 until (Math.random() * 150).toInt() + 50){
                val c = (32 + (Math.random() * 95).toInt()).toChar()
                res += c;
            }
            return res;
        }
    }
}

fun main(){
    val sc = Scanner(System.`in`);
    while (true)
    {
        println("Enter a string.")
        val s = sc.nextLine();
        println(Day54K.catOverKeyboard(s))
    }
}