package UselessJava.Day003

import java.util.*

class Day3K {
    fun determineType(n: Double): String? {
        if (n.toLong().toDouble() == n) {
            val i = n.toLong()
            if (i == 0L || i == 1L) {
                return "boolean"
            }
            if (i >= Byte.MIN_VALUE && i <= Byte.MAX_VALUE) {
                return if (i >= 0) "unsigned_byte" else "byte"
            }
            if (i >= Short.MIN_VALUE && i <= Short.MAX_VALUE) {
                return if (i >= 0) "unsigned_short" else "short"
            }
            if (i >= Int.MIN_VALUE && i <= Int.MAX_VALUE) {
                return if (i >= 0) "unsigned_int" else "int"
            }
            return if (i >= 0) "unsigned_long" else "long"
        }
        if (n >= Float.MIN_VALUE && n <= Float.MAX_VALUE) {
            return if (n >= 0) "unsigned_float" else "float"
        }
        return if (n >= 0) "unsigned_double" else "double"
    }

    fun determineType(s: String): String? {
        try{
            val n:Double = s.toDouble()
            return determineType(n);
        }
        catch (e: NumberFormatException){
            return Double.NaN.toString();
        }
    }
}

fun main(args: Array<String>){
    var d = Day3K();
    var sc: Scanner  = Scanner(System.`in`);
    var regex: Regex = Regex("(-*\\d*.*\\d+)")
    while(true) {
        println("Enter a number.");
        val s = sc.nextLine();
        println(d.determineType(s));
        println()
    }

}