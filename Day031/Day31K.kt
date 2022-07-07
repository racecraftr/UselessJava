package UselessJava.Day031

import UselessJava.Day003.Day3
import java.util.*

class Day31K() {
    val determiner = Day3() // meta-uselessness


    val typeTable = Hashtable<String, Int>()

    init {
        typeTable["boolean"] = 0
        typeTable["byte"] = 0
        typeTable["short"] = 0
        typeTable["int"] = 0
        typeTable["long"] = 0
        typeTable["float"] = 0
        typeTable["double"] = 0
        typeTable["unsigned_byte"] = 0
        typeTable["unsigned_short"] = 0
        typeTable["unsigned_int"] = 0
        typeTable["unsigned_long"] = 0
        typeTable["unsigned_float"] = 0
        typeTable["unsigned_double"] = 0
        typeTable["char"] = 0
        typeTable["String"] = 0
    }

    fun arrayType(s: String): String? {
        var s = s
        var finalType: String? = null
        s = s.trim { it <= ' ' }
        s = s.replace(",[ \\t]+".toRegex(), ",")
        s = s.replace("(^\\[|^\\(|\\]$|\\)$)".toRegex(), "")
        var hasSigned = false
        val strings = s.split(",".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (str in strings) {
            val type = determiner.determineType(str)
            typeTable[type] = typeTable[type]!! + 1
            if (!type.startsWith("unsigned_") && type != "char" && type != "boolean") hasSigned = true
            if (type == "String") return "String"
        }
        if (!hasSigned) {
            if (typeTable["boolean"]!! > 0) {
                finalType = "boolean"
            }
            if (typeTable["unsigned_byte"]!! > 0) {
                finalType = "unsigned_byte"
            }
            if (typeTable["unsigned_short"]!! > 0) {
                finalType = "unsigned_short"
            }
            if (typeTable["unsigned_int"]!! > 0) {
                finalType = "unsigned_int"
            }
            if (typeTable["char"]!! > 0) {
                finalType = "char"
            }
            if (typeTable["unsigned_long"]!! > 0) {
                finalType = "unsigned_long"
            }
            if (typeTable["unsigned_float"]!! > 0) {
                finalType = "unsigned_float"
            }
            if (typeTable["unsigned_double"]!! > 0) {
                finalType = "unsigned_double"
            }
            return finalType
        }
        if (typeTable["byte"]!! > 0 || typeTable["unsigned_byte"]!! > 0) {
            finalType = "byte"
        }
        if (typeTable["short"]!! > 0 || typeTable["unsigned_short"]!! > 0) {
            finalType = "short"
        }
        if (typeTable["int"]!! > 0) {
            finalType = "int"
        }
        if (typeTable["long"]!! > 0 || typeTable["unsigned_long"]!! > 0) {
            finalType = "long"
        }
        if (typeTable["float"]!! > 0 || typeTable["unsigned_float"]!! > 0) {
            finalType = "float"
        }
        if (typeTable["double"]!! > 0 || typeTable["unsigned_double"]!! > 0) {
            finalType = "double"
        }
        return finalType
    }
}

fun main(){
    val d = Day31K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter an array.")
    }
}