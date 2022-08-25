package UselessJava.days.Day079

import java.util.*

class Day79K {
  companion object{
    @JvmStatic val keys: Array<CharArray> = Day79.keys

    @JvmStatic
    fun navigation(s: String): String {
      var s = s
      s = s.lowercase(Locale.getDefault())
      var res = ""
      var row = 0
      var col = 0
      for (i in 0 until s.length) {
        when (s[i]) {
          'w' -> {
            row--
            row = Math.max(0, row)
          }

          'a' -> {
            col--
            col = Math.max(0, col)
          }

          's' -> {
            row++
            row = Math.min(Day79.keys.size - 1, row)
          }

          'd' -> {
            col++
            col = Math.min(Day79.keys[row].size - 1, col)
          }

          ' ' -> {
            res += " "
          }

          ':' -> {
            res += Day79.keys[row][col]
          }

          else -> {}
        }
      }
      return res
    }

    @JvmStatic
    fun printKeys() {
      for (key in Day79.keys) {
        println(Arrays.toString(key))
      }
      println("Use WASD to move up, right, down, left.\nUse [space] to type a space.\nUse : to output the current character.")
    }

  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true) {
    Day79K.printKeys()
    println(Day79K.navigation(sc.nextLine()))
  }
}