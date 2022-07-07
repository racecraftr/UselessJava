package UselessJava.Day031

import UselessJava.Day003.Day3K
import java.util.*

class Day31K {
    val determiner = Day3K() // meta-uselessness

    val types = Arrays.asList(
        "boolean",
        "byte",
        "short",
        "int",  //instead of making the code better, I am telling everyone to accept this:
        //all chars are ints and all ints are chars. Deal with it.
        //Therefore, chars take higher priority than ints, but lower priorities than longs. easy peasy
        //"But racecraftr, chars are bytes?" Then why do we have emojis? checkmate :)
        //because all chars are ints, then all chars are - by definition - longs, floats, doubles, and strings.
        //live with it lol
        "char",
        "long",
        "float",
        "double",
        "String"
    )

    fun arrayType(s: String): String? {
        var s = s
        var magnitude = 0
        s = s.replace(",[ \\t]+".toRegex(), "")
        s = s.replace("(^\\[|^\\(|\\]$|\\)$)".toRegex(), "")
        val strings = s.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (str in strings) {
            if (types.contains(determiner.determineType(str))) {
                magnitude = Math.max(
                    magnitude,
                    types.indexOf(determiner.determineType(str))
                )
            }
        }
        return types[magnitude]
    }
}

fun main(){
    val d = Day31K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter an array.")
    }
}