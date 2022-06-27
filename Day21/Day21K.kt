package UselessJava.Day21

import java.util.*

class Day21K {
    fun oldSchoolRoot(x: Float): Float {
        if (x < 0) {
            return Float.NaN
        }
        if (x == 0f) {
            return 0f
        }
        var low = 0f
        var high = x
        var mid = 0f
        var i = 0f
        if (x < 1) {
            low = x
            high = 1f
        }
        while (i < 25) {
            mid = (low + high) / 2
            if (mid * mid == x) {
                println("√x = $mid")
                return mid
            } else if (mid * mid < x) {
                low = mid
            } else {
                high = mid
            }
            println("$low < √x < $high")
            i++
        }
        println("√x ≈ $mid")
        return mid
    }

    fun oldSchoolRoot(s: String): Double {
        return try {
            val x = s.toFloat()
            oldSchoolRoot(x).toDouble()
        } catch (e: NumberFormatException) {
            Float.NaN.toDouble()
        }
    }
}

fun main(args: Array<String>) {
    val d = Day21()
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter a positive number")
        val s = sc.nextLine()
        println(d.oldSchoolRoot(s))
    }
}