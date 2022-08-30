package UselessJava.days.Day085

import java.util.*

class Day85K {
  companion object{
    fun isSus(s: String): Boolean {
      val regex = Regex("when the .* is sus.*")
      var s = s.lowercase()
      s = s.trim()
      s = s.replace(Regex("[ \\t]+"), " ")
      return s.matches(regex)
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while(true){
    println("Enter a string and I will see if it is sus.")
    val s = sc.nextLine()
    if(Day85K.isSus(s)){
      println("This string is sus, beware of impostors")
    }
    else{
      println("This string is not sus, you are safe to do your tasks")
    }
  }
}
