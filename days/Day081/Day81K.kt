package UselessJava.days.Day081

class Day81K {
  companion object{
    @JvmStatic fun roulette(){
      var streak = 0
      //crashes the program with a 1/6 chance for it to happen.
      while (true){
        println("Spinning...")
        print("[")
        for (i in 0 until 10){
          print("=")
          Thread.sleep(200)
        }
        println("]")
        val x = (Math.random() * 6).toInt()
        if (x == 0){
          break
        }
        println("Safe for now.")
        streak ++
        Thread.sleep(200)
      }
      try {
        println("".toInt())
      } catch (e: Exception){
        e.printStackTrace()
        println("You got a streak of $streak.")
      }
    }
  }
}

fun main(){
  Day81K.roulette()
}