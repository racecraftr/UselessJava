package UselessJava.days.Day080

import java.util.*
import kotlin.math.abs

class Day80K {
  companion object{

    @JvmStatic
    fun doubleInvertNumber(x: Int): Int {
      var x = x
      val isNegative = x < 0
      x = abs(x)
      var temp = 0
      while (x > 0) {
        temp += 9 - (x % 10)
        x /= 10
        temp *= 10
      }
      temp /= 10
      if (isNegative) {
        temp *= -1
      }
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