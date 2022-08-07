package UselessJava.days.Day062

import java.util.Scanner

class Day62K {
    companion object {
        fun amogus (s: String): String {
            val chars = s.toCharArray()
            var res = ""
            for(c in chars){
                val player: Int = c.code
                res += "GUYS I CAN VOUCH THAT player IS ${player}\n"
                res += "player CAN FOUCH GO AND TELL THEM COME ON"
            }
            return res
        }        
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    while(true){
        println("Enter a string or else u are sus")
        val s = sc.nextLine()
        println(Day62K.amogus(s))
    }
}