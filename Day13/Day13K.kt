package UselessJava.Day13

import java.util.*

class Day13K {
    fun decimalToFraction(x: Double): String? {
        if (x == 0.0) return "0"
        if (x == x.toLong().toDouble()) return java.lang.Long.toString(x.toLong())
        var n = Math.abs(x)
        var d: Long = 1

        //find number of decimal digits in number
        val text = java.lang.Double.toString(n)
        val decimalDigits = text.length - text.indexOf('.') - 1
        d *= Math.pow(10.0, decimalDigits.toDouble()).toLong()
        n *= Math.pow(10.0, decimalDigits.toDouble())
        var numerator = n.toLong()
        var denominator = d
        val gcd = gcd(numerator, denominator)
        numerator /= gcd
        denominator /= gcd
        if (x < 0) numerator *= -1
        return "$numerator/$denominator"
    }

    private fun gcd(n: Long, d: Long): Long {
        var gcd: Long = 1
        val x = Math.max(n, d)
        var i = 2
        while (i < Math.sqrt(x.toDouble())) {

            //if i is a factor of x, then x/i is a factor of x as well. So we can find the factors in O(sqrt(x)) time.
            if (n % i * 1L == 0L && d % i * 1L == 0L && i > gcd) {
                gcd = i.toLong()
            }
            if (n % (x / i) * 1L == 0L && d % (x / i) * 1L == 0L && x / i > gcd) {
                return x / i
            }
            i++
        }
        return gcd
    }

    fun isADouble(s: String): Boolean {
        //see if a string is a double.
        return try {
            s.toDouble()
            true
        } catch (e: NumberFormatException) {
            false
        }
    }
}

fun main(){

    val sc = Scanner(System.`in`)
    val d = Day13K()
    while (true) {
        println("Enter a number or not idk")
        val s = sc.nextLine()
        if (d.isADouble(s)) {
            println(d.decimalToFraction(s.toDouble()))
        } else {
            println(Double.NaN)
        }
    }
}