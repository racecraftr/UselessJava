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
      for (i in s.indices) {
        when (s[i]) {
          'w' -> {
            row--
            row = 0.coerceAtLeast(row)
          }

          'a' -> {
            col--
            col = 0.coerceAtLeast(col)
          }

          's' -> {
            row++
            row = (Day79.keys.size - 1).coerceAtMost(row)
          }

          'd' -> {
            col++
            col = (Day79.keys[row].size - 1).coerceAtMost(col)
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