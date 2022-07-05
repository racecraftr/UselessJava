package UselessJava.Day027

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

class Day27K {
    fun what(): String? {
        val punctuation = ". ? ! ,".split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var res: String? = ""
        for (i in 0 until (Math.random() * 100).toInt()) {
            res += getRandomLine()
            val punc = (Math.random() * punctuation.size * 3).toInt()
            if (punc < punctuation.size) res += punctuation[punc]
            res += " "
        }
        return res
    }

    private fun getRandomLine(): String? {
        val lines: ArrayList<String> = try {
            Files.readAllLines(Paths.get("./Day027/words.txt")) as ArrayList<String>
        } catch (e: IOException) {
            e.printStackTrace()
            return ""
        }
        val random = Random()
        return lines[random.nextInt(lines.size)]
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