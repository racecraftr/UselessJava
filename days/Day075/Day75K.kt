package UselessJava.days.Day075

import java.util.*

class Day75K {
  companion object {
    @JvmStatic fun sizeOfString(s: String): String{
      val bytes = s.toByteArray()
      val length = bytes.size
      val res = "$length B"
      if(length < 1000){
        return res
      }

      var d: Double = length.toDouble()
      var magnitude = 0
      while(d >= 1000 && magnitude <= 3){
        magnitude ++
        d /= 1000.0
      }

      var magString = "B"
      when (magnitude) {
        1 -> magString = "KB"
        2 -> magString = "MB"
        3 -> magString = "GB"
      }

      return "${String.format("%.2f", d)} $magString"
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true){
    println("Enter a string.")
    val s = sc.nextLine()
    println(Day75K.sizeOfString(s))
  }
}