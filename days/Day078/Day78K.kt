package UselessJava.days.Day078

import java.util.*

class Day78K {
  companion object{
    @JvmStatic val keys: Array<CharArray> = Day78.keys
    @JvmStatic val shiftKeys: Array<CharArray> = Day78.shiftKeys
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
        keys[(Math.random() * Day78.keys.size).toInt()][(Math.random() * Day78.keys[0].size).toInt()]
      var charFound = false
      if(s[i] == ' '){
        return
      }
      for (row in keys.indices) {
        if (charFound) {
          break
        }
        for (col in keys[row].indices) {
          if (keys[row][col] == s[i]) {
            wrongChar = getSurrounding(keys, row, col)
            charFound = true
            break
          }
        }
      }

      for(row in shiftKeys.indices){
        if(charFound){
          break
        }
        for (col in shiftKeys[row].indices){
          if(shiftKeys[row][col] == s[i]){
            wrongChar = getSurrounding(shiftKeys, row, col)
            charFound = true
            break
          }
        }
      }
      print(wrongChar)
      Thread.sleep(200 + (Math.random() * 100).toLong())
      print("\b")
      Thread.sleep(200 + (Math.random() * 100).toLong())
    }

    @JvmStatic
    private fun getSurrounding(chars: Array<CharArray>, row: Int, col: Int): Char {
      var wrongChar = chars[(Math.random() * chars.size).toInt()][(Math.random() * chars[0].size).toInt()]
      when ((Math.random() * 4).toInt()) {
        0 -> {
          wrongChar = chars[row][Math.max(0, col - 1)]
        }

        1 -> {
          wrongChar = chars[row][Math.min(chars[row].size - 1, col + 1)]
        }

        2 -> {
          wrongChar = chars[Math.max(0, row - 1)][col]
        }

        3 -> {
          wrongChar = chars[Math.min(chars.size - 1, row + 1)][col]
        }
      }
      return wrongChar
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