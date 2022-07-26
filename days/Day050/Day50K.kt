package UselessJava.days.Day050

import java.util.*
import kotlin.math.abs

class Day50K{

    companion object{
        @JvmStatic val init = """
            >+++++[<+++++++++++++>-]<>>++++++++[<++++++++++++>-]<+>>++++[<++++++++>-]<<<
            
            """.trimIndent()

        @JvmStatic fun brainString(s: String): String{
            val chars = s.toCharArray()
            val currentChars = charArrayOf('A', 'a', ' ')
            var res = ""
            res += init
            for(char: Char in chars){
                if (char >= 'a') {
                    res += ">"

                    val difference: Int = char.code - currentChars[1].code
                    val aChar = if (difference > 0) '+' else '-'
                    res += loop(aChar, abs(difference))

                    res += ".\n<"
                    currentChars[1] = char
                    continue
                }
                if(char >= 'A'){

                    val difference = char.code - currentChars[0].code
                    val aChar = if(difference > 0) '+' else '-'
                    res += loop(aChar, abs(difference))

                    res += ".\n"
                    currentChars[0] = char
                    continue
                }

                res += ">>"

                val difference = char.code - currentChars[2].code
                val aChar = if(difference > 0) '+' else '-'
                res += loop(aChar, abs(difference))

                currentChars[2] = char
                res += ".\n<<"
            }
            res = res.replace("(<>|><)".toRegex(), "")
            return res
        }

        @JvmStatic fun loop(c: Char, times: Int): String{
            if(times <= 0) return ""
            var res = ""
            for(i in 0 until times){
                res += c;
            }
            return res;
        }
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string.")
        val s = sc.nextLine();
        println(Day50K.brainString(s))
    }
}