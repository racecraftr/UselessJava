package UselessJava.days.Day083

import java.util.*

class Day83K {
  companion object{
    fun triangleString(s: String): String {
      var s = s
      s = s.replace("\\t".toRegex(), "")
      val chars = s.toCharArray()
      var x = 0
      var max = 1
      var res = ""
      for (c in chars) {
        res += c.toString() + "\t"
        x++
        if (x == max) {
          res += "\n"
          x = 0
          max++
        }
      }
      return res
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`);
  while (true){
    println("Enter a string.")
    val s = sc.nextLine()
    println(Day83K.triangleString(s))
  }
}