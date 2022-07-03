package UselessJava.Day27

import java.util.*

class Day27K {
    fun what(): String? {
        val strings =
            "if and but so for it to by go get you have has is be ever".split(" ".toRegex()).dropLastWhile { it.isEmpty() }
                .toTypedArray()
        val punctuation = ". ? ! ,".split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var res = ""
        for (i in 0 until (Math.random() * 100).toInt()) {
            res += strings[(Math.random() * strings.size).toInt()]
            val punc = (Math.random() * punctuation.size * 3).toInt()
            if (punc < punctuation.size) res += punctuation[punc]
            res += " "
        }
        return res
    }
}
//have to keep main method outside kotlin class lol :(
fun main(args: Array<String>) {
    val d = Day27K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("press enter to generate")
        val s = sc.nextLine()
        println(
            """
                ${d.what()}
                
                """.trimIndent()
        )
    }
}