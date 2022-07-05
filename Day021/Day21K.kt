package UselessJava.Day021

import java.util.*

class Day21K {
    fun oldSchoolRoot(x: Float): Float {
        if (x < 0) {
            return Float.NaN
        }
        if (x == 0f) {
            return 0f
        }
        var low = Math.min(1f, x)
        var high = Math.max(1f, x)
        var mid = 0f
        var i = 0f

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
    val d = Day21K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter a positive number")
        val s = sc.nextLine()
        println(d.oldSchoolRoot(s))
    }
}