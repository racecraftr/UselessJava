package UselessJava.Day023

import java.util.*

class Day23K {
    fun findComplement(color: String): String {
        var color = color
        color = color.lowercase()
        color = color.replace("[ \\t]".toRegex(), "")
        if (color.matches(Regex("#*[\\da-f]{6}"))) {
            color = color.replace("#".toRegex(), "")
            val s = 0xFFFFFF - color.toInt(16)
            return "#" + String.format("%06X", s)
        }
        if (color.matches(Regex("\\(\\d{1,3},\\d{1,3},\\d{1,3}\\)"))) {
            color = color.replace("[()]".toRegex(), "")
            val strings = color.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val ints = IntArray(strings.size)
            for (i in strings.indices) {
                val n = strings[i].toInt()
                if (n > 0xFF || n < 0) return "Not a valid color"
                ints[i] = 0xFF - n
            }
            return "(" + ints[0] + ", " + ints[1] + ", " + ints[2] + ")"
        }
        return "Not a valid color"
    }
}

fun main(){
    val d = Day23K()
    val sc = Scanner(System.`in`);
    while (true){
        println("Enter a color.")
        val s = sc.nextLine()
        println(
            """
                 ${d.findComplement(s)}
                 
                 """.trimIndent()
        )
    }
}