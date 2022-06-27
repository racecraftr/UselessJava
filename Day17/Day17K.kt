package UselessJava.Day17

import java.util.*

class Day17K {
    fun generateCheckerboard(size: Int): String? {
        return generateCheckerboard(size, size)
    }


    fun generateCheckerboard(width: Int, height: Int): String? {
        //More designs include:
        /*
      Default: new String[]{"⬜","⬛"};
      Rainbows: new String[] {"🟥","🟧","🟨","🟩","🟦","🟪"}
      Anarchist: "dasfkljadklf jadslkcj sadl cjsldjf".split("");
      Amogus: "🌌ඞ".split("")
      Void: new String[] {" "}
      XO: new String[] {"x", "o"}
      add more if you want :D
       */
        val chars = arrayOf("🟥", "🟧", "🟨", "🟩", "🟦", "🟪")
        var s = ""
        for (i in 0 until height) {
            for (j in 0 until width) {
                s += chars[(i + j) % chars.size]
            }
            s += "\n"
        }
        return s
    }
}

fun main(){
    val d = Day17K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter an integer.")
        val s = sc.nextLine()
        if (s.matches(Regex("\\d+ *, *\\d+"))) {
            val strings = s.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val width = strings[0].trim { it <= ' ' }.toInt()
            val height = strings[1].trim { it <= ' ' }.toInt()
            println(d.generateCheckerboard(width, height))
            continue
        }
        try {
            val size = s.toInt()
            println(d.generateCheckerboard(size))
        } catch (e: NumberFormatException) {
            println(Double.NaN)
        }
    }
}