package UselessJava.days.Day059

import java.util.*

class Day59K{
    companion object{
        @JvmStatic val keys: Array<String> = Day59.keys

        @JvmStatic fun averageFingerDistance(s: String): Double{
            var d = 0.0
            val chars = s.toCharArray()
            for (char in chars) {
                for(i in keys.indices){
                    if(keys[i].indexOf(char) >= 0){
                        d += i.toDouble()
                        break
                    }
                }
            }

            d /= chars.size.toDouble()
            return d
        }
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string.")
        val s = sc.nextLine();
        println("On a standard QWERTY Keyboard, your fingers had to travel an average of ${
            Day59K.averageFingerDistance(s)
        } keywidths away.")
    }
}