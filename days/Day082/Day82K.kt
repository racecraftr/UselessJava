package UselessJava.days.Day082

import java.util.*

class Day82K {
  companion object{
    fun squareString(s: String): String? {
      var s = s
      s = s.replace("[ \\t]".toRegex(), "")
      var res = ""
      val root = Math.sqrt(s.length.toDouble()).toInt()
      var x = 0
      for (i in s.indices) {
        res += s[i].toString() + "\t"
        x++
        if (x == root) {
          res += "\n"
          x = 0
        }
      }
      return res
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true){
    println("Enter a string. ")
    val s = sc.nextLine();
    println(Day82K.squareString(s))
  }
}