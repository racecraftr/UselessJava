package UselessJava.Day003

import java.util.*

class Day3K {
    fun determineType(n: Double): String {
        if(n.equals(n.toLong())){
            val l: Long = n.toLong();
            if(l == 0L || l == 1L){return "boolean";}
            if(l >= Byte.MIN_VALUE && l <= Byte.MAX_VALUE){return "byte";}
            if(l >= Short.MIN_VALUE && l <= Byte.MAX_VALUE){return "short";}
            if(l >= Int.MIN_VALUE && l <= Int.MAX_VALUE){return "int";}
            return "long";
        }
        if(n >= Float.MIN_VALUE && n <= Float.MAX_VALUE){return "float";}
        return "double"
    }

    fun determineType(s: String): String{
        try{
            val n = s.toDouble()
            return determineType(n);
        }
        catch (e: NumberFormatException){
            return Double.NaN.toString();
        }
    }
}

fun main(args: Array<String>){
    var d = Day3K();
    var sc: Scanner  = Scanner(System.`in`);
    var regex: Regex = Regex("(-*\\d*.*\\d+)")
    while(true) {
        println("Enter a number.");
        val s = sc.nextLine();
        println(d.determineType(s));
        println()
    }

}