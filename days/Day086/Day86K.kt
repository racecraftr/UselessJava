package UselessJava.days.Day086

import java.util.*

class Day86K {
  companion object{
    val random: Random = Random()

    fun addMult(d: Double): String{
      //define two numbers that add up to d.
      val x: Float = random.nextFloat()
      val y: Double = d - x
      val product: Double = x * y

      return """
      x + y = $d
      xy = $product
      """.trimIndent()
    }

    fun addMult(s: String): String?{
      try{
        val x: Double = s.toDouble();
        return addMult(x)
      }
      catch(e: Exception){
        return null
      }
    }
  }
}

fun main(){
  val sc = Scanner(System.`in`)
  while (true) {
    println("Enter a number.")
    val s = sc.nextLine()
    println(Day86K.addMult(s))
  }
}
