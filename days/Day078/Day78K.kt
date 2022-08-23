package UselessJava.days.Day078

import java.util.*

class Day78K {
  companion object{
    @JvmStatic val keys: Array<CharArray> = Day78.keys

    @Throws(InterruptedException::class)
    @JvmStatic
    fun badTyping(s: String) {
      for (i in s.indices) {
        if (Math.random() < 1.0 / 4) {
          var x = 0
          while (x < Math.random() * 2) {
            printRandomChar(s, i)
            x++
          }
        }
        print(s[i])
        Thread.sleep(200 + (Math.random() * 100).toLong())
      }
    }

    @Throws(InterruptedException::class)
    @JvmStatic
    private fun printRandomChar(s: String, i: Int) {
      var wrongChar =
        Day78.keys[(Math.random() * Day78.keys.size).toInt()][(Math.random() * Day78.keys[0].size).toInt()]
      var charFound = false
      for (row in Day78.keys.indices) {
        for (col in Day78.keys[row].indices) {
          if (Day78.keys[row][col] == s[i]) {
            val x = (Math.random() * 4).toInt()
            when (x) {
              0 -> {
                wrongChar = Day78.keys[row][Math.max(0, col - 1)]
              }

              1 -> {
                wrongChar = Day78.keys[row][Math.min(Day78.keys[row].size - 1, col + 1)]
              }

              2 -> {
                wrongChar = Day78.keys[Math.max(0, row - 1)][col]
              }

              3 -> {
                wrongChar = Day78.keys[Math.min(Day78.keys.size - 1, row + 1)][col]
              }
            }
            charFound = true
            break
          }
        }
        if (charFound) {
          break
        }
      }
      print(wrongChar)
      Thread.sleep(200 + (Math.random() * 100).toLong())
      print("\b")
      Thread.sleep(200 + (Math.random() * 100).toLong())
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true){
    println("Enter a string.")
    Day78K.badTyping(sc.nextLine())
    println()
  }
}