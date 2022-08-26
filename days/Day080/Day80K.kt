package UselessJava.days.Day080

import java.util.*

class Day80K {
  companion object{
    @JvmStatic
    val inverted: IntArray = intArrayOf(
      9, 8, 7, 6, 5, 4, 3, 2, 1, 0
    )

    @JvmStatic
    fun doubleInvertNumber(x: Int): Int {
      var x = x
      val isNegative = x < 0
      if (isNegative) x *= -1
      var temp = 0
      while (x > 0) {
        temp += Day80.inverted[x % 10]
        x /= 10
        temp *= 10
      }
      temp /= 10
      if (isNegative) temp *= -1
      return temp
    }

    fun doubleInvertNumber(s: String): Int {
      return try {
        val x = s.toInt()
        doubleInvertNumber(x)
      } catch (e: Exception) {
        0
      }
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true) {
    println("Enter an integer")
    val s = sc.nextLine()
    println(Day80K.doubleInvertNumber(s))
  }
}