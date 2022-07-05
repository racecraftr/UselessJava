package UselessJava.Day025

import java.util.*

class Day25K {
    fun generateRandomCoordinate(): String? {
        val lat = charArrayOf('N', 'S')
        val lon = charArrayOf('E', 'W')
        val latitude = Math.random() * 90
        val longitude = Math.random() * 180
        val latString = toDMS(latitude) + lat[(Math.random() * 2).toInt()]
        val longString = toDMS(longitude) + lon[(Math.random() * 2).toInt()]
        return "$latString $longString"
    }

    private fun toDMS(decimal: Double): String {
        var d = decimal
        val l1 = d.toLong()
        d -= l1.toDouble()
        d *= 60.0
        val l2 = d.toLong()
        d -= l2.toDouble()
        d *= 60.0
        val l3 = d.toLong()
        return l1.toString() + "º " + l2 + "' " + l3 + "\""
    }
}

fun main(){
    val d = Day25K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("press enter to generate a random coordinate!")
        val s = sc.nextLine()
        println(d.generateRandomCoordinate())
    }
}