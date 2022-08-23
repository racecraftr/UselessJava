package UselessJava.days.Day077

import java.util.*

class Day77K {
  companion object{
    @JvmStatic fun isIpAddress(s: String): Boolean {
      val s1 = s.uppercase()
      if(s1.matches(Regex("((\\d{1,3})\\.){3}\\d{1,3}"))) {
        val strings = s1.split(Regex("\\."));

        for (string in strings) {
          try{
            val x = string.toInt()
            if(x > 255) return false
          }

          catch (e: Exception){
            return false
          }
        }
        return true
      }

      else if(s1.matches(Regex("(([\\dA-F]{1,4}):){7}([\\dA-F]{1,4})"))) {
        val strings = s1.split(":")

        for (string in strings) {
          try{
            val x = string.toInt(16)
            if(x > 0xFFFF) return false
          }

          catch (e: Exception){
            return false
          }
        }
        return true
      }

      return false
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true){
    println("Enter an IP address that could exist. We're not doxxing anyone today. ")
    val s = if (Day77K.isIpAddress(sc.nextLine())) "This is a valid IP address" else "This is not a valid IP address"
    println(s)
  }
}