package UselessJava.days.Day072

import java.util.*

class Day72K {
  companion object{
    @JvmStatic fun delete(s: String){
      println(s)
      Thread.sleep(200)
      for (i in s.indices){
        println("\b")
        Thread.sleep(200)
      }
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while(true){
    println("Enter a string.")
    val s = sc.nextLine()
    Day72K.delete(s)
  }
}