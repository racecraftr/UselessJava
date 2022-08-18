package UselessJava.days.Day073

import java.util.*

class Day73K {
  companion object{
    @JvmStatic val emojis: Array<String> = Day73.emojis
    @JvmStatic fun mlm(s: String): String {
      /* for context, mlm does NOT mean "men loving men"
      it means "multi level marketing."
      People in MLMs will often advertise to you in a...certain way. */

      val words = s.split(" ".toRegex());
      var res = "";
      for(word in words){
        res += "$word "
        if(Math.random() < 1.0/3){
          for(i in 0 until (Math.random() * 10).toInt()){
            res += emojis[(Math.random() * emojis.size).toInt()]
          }
          res += " "
        }
      }
      return res
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true){
    println("Enter a string.")
    val s = sc.nextLine();
    println(Day73K.mlm(s))
  }
}