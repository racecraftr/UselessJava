package UselessJava.days.Day029

import java.util.*

class Day29K {
    fun flip(s: String): String? {
        val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!?&\\/"
        val flipped = "∀qƆpƎℲפHIſʞ˥WNOԀQɹS┴∩ΛMX⅄Zɐqɔpǝɟƃɥᴉɾʞlɯuodbɹsʇnʌʍxʎz0ƖᄅƐㄣϛ9ㄥ86¡¿⅋/\\"
        var res = ""
        for (i in 0 until s.length) {
            val c = s[i]
            res += if (chars.indexOf(c) > -1) {
                flipped[chars.indexOf(c)]
            } else c
        }
        return res
    }
}

fun main(){
    val d = Day29K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter a string")
        val s = sc.nextLine()
        println(
            """
            ${d.flip(s)}
            
            """.trimIndent()
        )
    }
}