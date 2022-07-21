package UselessJava.days.Day045

import UselessJava.days.Day011.Day11

class Day45K {
    val d = Day11()

    @kotlin.jvm.Throws
    fun waitLonger(){
        var i = 1;
        while (true){
            var s = "$i "
            if((Math.random() * 10).toInt() == 1 && i >= 20){
                s += d.getRandomLine("days/Day045/insults.txt")
            }
            println(s)
            Thread.sleep(i * 100L)
            i++
        }
    }
}

fun main(){
    val d = Day45K()
    d.waitLonger()
}