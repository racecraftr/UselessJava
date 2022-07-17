package UselessJava.days.Day040

import java.util.*

class Day40K{
    @kotlin.jvm.Throws
    fun count(){
        while (true){
            var max = 10
            if((Math.random() * 100).toInt() == 1){
                max = 11
            }
            for (i in 1..max) {
                println(i)
                Thread.sleep(500)
            }
            println("Starting over...\n")
            Thread.sleep(500)
        }
    }
}

@kotlin.jvm.Throws
fun main(){
    val d = Day40K()
    val sc = Scanner(System.`in`)
    val s = sc.nextLine()
    d.count()
}