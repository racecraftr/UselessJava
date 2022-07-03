package UselessJava.Day26

import java.util.*

class Day26K {
    fun makeGreyscale(s: String): String? {
        var s = s
        s = s.replace("[ \\t#]".toRegex(), "")
        s = s.lowercase();
        //is s a hex code?
        if (s.matches(Regex("[\\da-f]{6}"))) {
            val hexcode = s.toInt(16)
            val r = hexcode and 0xFF0000 shr 16
            val g = hexcode and 0x00FF00 shr 8
            val b = hexcode and 0x0000FF

            if (r == g && g == b) {
                return "#" + Integer.toHexString(hexcode)
            }

            val brightness = Integer.toHexString((0.299 * r + 0.597 * g + 0.114 * b).toInt())
            return "#$brightness$brightness$brightness"
        }
        if (s.matches(Regex("\\(\\d{1,3},\\d{1,3},\\d{1,3}\\)"))) {
            s = s.replace("[()]".toRegex(), "")
            val strings = s.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val ints = IntArray(strings.size)
            for (i in strings.indices) {
                ints[i] = strings[i].toInt()
                if (ints[i] > 255) return "Not a valid color"
            }
            val brightness = (0.299 * ints[0] + 0.597 * ints[1] + 0.114 * ints[2]).toInt().toString() + ""
            return "($brightness, $brightness, $brightness)"
        }
        return "Not a valid color"
    }
}

fun main(){
    val d = Day26K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter a color")
        val s = sc.nextLine()
        println(
            """
            ${d.makeGreyscale(s)}
            
            """.trimIndent()
        )
    }
}