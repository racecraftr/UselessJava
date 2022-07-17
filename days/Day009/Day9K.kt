package UselessJava.days.Day009

import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.util.*

class Day9K {
    @kotlin.jvm.Throws
    fun multiHash(s: String, times: Int): String {
        println("iterations: 0, result: $s")
        if(times <= 0) return s
        var res = s
        for(i in 1..times){
            try{
                val md = MessageDigest.getInstance("SHA-256")
                md.update(res.toByteArray())
                val digest = md.digest()
                val sb = StringBuffer()
                for (b in digest) {
                    sb.append(String.format("%02x", b.toInt() and 0xff))
                }
                res  = sb.toString()
                println("iterations: $i, ")
            } catch (e: java.lang.Exception){
                e.printStackTrace()
            }
        }
        return res
    }

    @Throws(NoSuchAlgorithmException::class)
    fun multiHash(s: String): String {
        if (s.matches("([^ ]+ -*\\d+)".toRegex())) {
            val things = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
            val s1 = things[0].replace("_".toRegex(), " ")
            val times = things[1].toInt()
            return multiHash(s1, times)
        }
        return multiHash(s, 1)
    }
}

fun main(){
    val d = Day9K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Enter a string or else")
        val s = sc.nextLine()
        println("${d.multiHash(s)}\n")
    }
}