package UselessJava.days.Day064

import java.util.Scanner

class Day64K {
    companion object {
        @JvmStatic
        fun fastMath(equation: String): String {
            if (equation.matches(
                            "((-*\\d+(\\.\\d+)*)([ \\t]*)[+\\-*/]([ \\t]*))+(-*\\d+(\\.\\d+)*)".toRegex()
                    )
            ) {
                return (Math.random() * Int.MAX_VALUE).toInt().toString()
            }
            return "Not a valid equation"
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter equation: ")
        val equation = sc.nextLine()
        println(Day64K.fastMath(equation))
    }
}
