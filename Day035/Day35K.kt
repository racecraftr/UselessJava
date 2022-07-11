package UselessJava.Day035

import java.util.*

class Day35K {
    val patternChars = "▖▗▘▙▚▛▜▝▞▟█".toCharArray()

    fun generatePattern(width: Int, length: Int): String{
        var res = "";
        for (i in 0 until length){
            for (j in 0 until width){
                res += patternChars.get((Math.random() * patternChars.size).toInt())
            }
            res += "\n"
        }
        return res;
    }

    fun generatePattern(s: String): String{
        var s = s;
        s = s.replace(Regex("[^,\\d]"), "")
        if(s.matches(Regex("\\d+,\\d+"))){
            val strings = s.split(Regex(","))
            val i1 = strings[0].toInt();
            val i2 = strings[1].toInt();
            return generatePattern(i1, i2)
        }
        try {
            val i = s.toInt()
            return generatePattern(i, i)
        } catch (e: java.lang.NumberFormatException){
            return "Not a valid number"
        }
    }
}

fun main(){
    val d = Day35K()
    val sc = Scanner(System.`in`)
    while (true){
        println("enter a number.")
        val s = sc.nextLine();
        println(d.generatePattern(s))
    }
}