package UselessJava.Day033

import java.util.*

class Day33K {
    private fun shuffle(numbers: Array<Number?>) {
        for (i in numbers.indices) {
            val i1 = (Math.random() * numbers.size).toInt()
            val i2 = (Math.random() * numbers.size).toInt()
            val temp = numbers[i2]
            numbers[i2] = numbers[i1]
            numbers[i1] = temp
        }
    }

    fun findPath(number: Int): String? {
        val numbers = arrayOfNulls<Number>(Math.max(50, number * 2))
        for (i in numbers.indices) {
            numbers[i] = i
        }
        shuffle(numbers)
        var s = ""
        var i = number
        while (numbers[i]!!.toInt() != number) {
            s += """
            numbers[$i] -> ${numbers[i]}
            
            """.trimIndent()
            i = numbers[i]!!.toInt()
        }
        s += """
             numbers[$i] -> ${numbers[i]}
             
             """.trimIndent()
        s = """
             Numbers: ${Arrays.toString(numbers)}
             $s
             """.trimIndent()
        return s
    }

    fun findPath(s: String): String? {
        return try {
            val d = s.toInt()
            if (d >= 0) {
                findPath(d)
            } else "Not a valid number"
        } catch (e: NumberFormatException) {
            "Not a valid number"
        }
    }
}

fun main(){
    val d = Day33K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a positive integer.")
        val s = sc.nextLine();
        println("${d.findPath(s)}\n")
    }
}