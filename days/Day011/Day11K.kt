package UselessJava.days.Day011

import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.util.*

class Day11K {
    //Tonight on bottom gear...I <v> my car through a <n> <nl> Hammond puts a <n> on <n> <nl> and May <sv> a <n> in the middle of a <n>.
    private val root = "days/Day011/wordLists/"

    @Throws(IOException::class)
    fun madLibs(s: String, num: Int): String? {
        val words = s.split("[ \\t\\n]+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var res = ""
        for (i in 0 until Math.max(num, 1)) {
            for (word in words) {
                /*
            use the respective "syntax" to specify a word type.
            <noun> or <n> is a random noun.
            <adverb> or <adv> is a random adverb.
            <pnoun> or <pn> is a random plural noun.
            If you are every confused, just look at the regexes - they're the key. :D

            Try: madLibs("I want to <v> a <n> really badly, but Mom won't let me because it is \"too <adj>.\"", 10)
             */
                var word = word
                word = word.replace("(<noun>|<n>)".toRegex(), getRandomLine(root + "nounList.txt"))
                word = word.replace("(<adverb>|<adv>)".toRegex(), getRandomLine(root + "adverbList.txt"))
                word = word.replace("(<adjective>|<adj>)".toRegex(), getRandomLine(root + "adjectiveList.txt"))
                word = word.replace(
                    "(<plural noun>|<pnoun>|<pn>)".toRegex(),
                    pluralizeNoun(getRandomLine(root + "nounList.txt"))!!
                )
                word = word.replace(
                    "(<singular verb>|<sverb>|<sv>)".toRegex(),
                    singularVerb(getRandomLine(root + "verbList.txt"))!!
                )
                word = word.replace(
                    "(<plural verb>|<pverb>|<pv>|<verb>|<v>)".toRegex(),
                    getRandomLine(root + "verbList.txt")
                )
                word = word.replace(
                    "(<present verb>|<psv>)".toRegex(),
                    presentTense(getRandomLine(root + "verbList.txt"))!!
                )
                word = word.replace(
                    "(<past tense verb>|<ptv>)".toRegex(),
                    pastTense(getRandomLine(root + "verbList.txt"))!!
                )

                //newline option :D
                word = word.replace("(<newline>|<nl>|\\\\n)".toRegex(), "\n")
                res += "$word "
            }
            res += "\n"
        }
        return res
    }

    @Throws(IOException::class)
    fun madLibs(s: String): String? {

        //to specify multiple madLib instances in one line, write your string with a tab and a positive integer in square brackets.
        //example: I want to <v> a <n> really badly, but Mom won't let me because it is "too <adj>." [10]

        //more formatting options :D
        val string = s.replace("(<tab>|<t>|\\\\t)".toRegex(), "\t")
        if (s.matches("(.+\\t+\\[\\d+])".toRegex())) {
            val strings = s.split("\\t".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val numString = strings[1].substring(1, strings[1].length - 1)
            val num = numString.toInt()
            return madLibs(strings[0], num)
        }
        return madLibs(s, 1)
    }

    private fun getRandomLine(path: String): String {
        val lines: List<String>
        lines = try {
            Files.readAllLines(Paths.get(path))
        } catch (e: IOException) {
            e.printStackTrace()
            return "[ERROR]"
        }
        return lines[(Math.random() * lines.size).toInt()]
    }

    private fun pluralizeNoun(noun: String): String? {
        //return the plural of the noun
        if (noun == "goose") return "geese"
        if (noun.endsWith("ey")) return noun + "s"
        if (noun.endsWith("y")) return noun.substring(0, noun.length - 1) + "ies"
        return if (noun.endsWith("s")) noun + "es" else noun + "s"
    }

    private fun pastTense(verb: String): String? {
        //return the past tense of the verb
        if (verb == "did" || verb == "was" || verb == "let") {
            return verb
        }
        if (verb == "bring") return "brought"
        if (verb.endsWith("buy")) return "bought"
        if (verb.endsWith("ing")) return verb.substring(0, verb.length - 3) + "ought"
        if (verb.endsWith("ell")) {
            return verb.substring(0, verb.length - 3) + "old"
        }
        if (verb.endsWith("ed")) return verb
        if (verb == "be") return "was"
        if (verb == "have") return "had"
        if (verb == "do") return "did"
        if (verb == "can") return "could"
        return if (verb.endsWith("e")) verb + "d" else verb + "ed"
    }

    private fun presentTense(verb: String): String? {
        //return the present tense of the verb
        if (verb.endsWith("ed")) return verb.substring(0, verb.length - 2) + "ing"
        if (verb == "be") return "is"
        if (verb == "have") return "has"
        if (verb == "do") return "does"
        return if (verb.endsWith("e")) verb.substring(0, verb.length - 1) + "ing" else verb + "ing"
    }

    private fun singularVerb(verb: String): String? {
        if (verb.endsWith("sh")) return verb + "es"
        if (verb.endsWith("ch")) return verb + "es"
        return if (verb == "be") "are" else verb + "s"
    }
}

@kotlin.jvm.Throws(IOException::class)
fun main(){
    val d = Day11K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string bud. Do it. You won't");
        val s = sc.nextLine()
        println(d.madLibs(s))
    }
}