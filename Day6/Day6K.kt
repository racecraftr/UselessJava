package UselessJava.Day6

import java.io.File
import java.util.*

class Day6K() {
    var dictionary = HashMap<Char, ArrayList<String>>()

        constructor (dictionaryFile: String?) : this() {
        val file = dictionaryFile?.let { File(it) }
            for (i in 0..25) {
                dictionary[(i + 'A'.code).toChar()] = ArrayList()
            }
            //read a text file and put each word into the dictionary
            try {
                val sc = Scanner(file)
                while (sc.hasNext()) {
                    val s = sc.next()
                    val c = s[0]
                    if (dictionary.containsKey(c)) dictionary[c]!!.add(s)
                }
            } catch (e: Exception) {
                println("Error: " + e.message)
            }
    }

    fun createAcronym(s: String): String? {
        val chars = s.uppercase().toCharArray()
        var res: String? = ""
        for (c in chars) {
            if (dictionary.containsKey(c)) {
                val strings = dictionary[c]!!
                res += strings[(Math.random() * strings.size).toInt()] + " "
            } else res += c
        }
        return res
    }
}

/*
   Dictionary file (allWordsInDictionary.txt) from https://github.com/dwyl/english-words.
   This contains over 450,000 words, so there may be some strange words you may not recognize.
    */
var dictionaryFile = "Enter Absolute Path of dictionary file here"

fun main(args: Array<String>) {
    val d = Day6K(dictionaryFile)
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter a word.")
        val s = sc.nextLine()
        println(d.createAcronym(s))
        println()
    }
}