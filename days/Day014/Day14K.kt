package UselessJava.days.Day014

import java.util.*

class Day14K {
    fun sortString(s: String): String? {
        val chars = s.toCharArray()
        quickSort(chars)
        return String(chars)
    }

    private fun quickSort(chars: CharArray) {
        quickSort(chars, 0, chars.size - 1, 0)
    }

    private fun quickSort(chars: CharArray, start: Int, end: Int, iterations: Int) {
        println("iterations: " + iterations + "\tresult: " + String(chars))
        if (start >= end) return
        val pivot = chars[(start + end) / 2].code
        var i = start
        var j = end
        while (i <= j) {
            while (chars[i].code < pivot) i++
            while (chars[j].code > pivot) j--
            if (i <= j) {
                val temp = chars[i]
                chars[i] = chars[j]
                chars[j] = temp
                i++
                j--
            }
        }
        quickSort(chars, start, j, iterations + 1)
        quickSort(chars, i, end, iterations + 1)
    }
}

fun main(){
    val d = Day14K()
    val sc = Scanner(System.`in`);
    while(true){
        println("Enter a number.")
        val s = sc.nextLine();
        println(d.sortString(s) + "\n")
    }
}