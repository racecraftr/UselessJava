package UselessJava.Day10

import java.util.*

class Day10K {
    fun randomSpace(s: String?): String?{

        if(s == null) return s

        var chars = s.toCharArray()
        var spaces: Array<String> = arrayOf("\t", "\n", "...", ", ", ". ", "? ", "! ", ": ", "; ")
        var res = "";
        for (c in chars) {
            //random stuff :D
            res += c;
            var n = (Math.random() * spaces.size * 3).toInt()
            if(n < spaces.size) res += spaces[n]
        }
        return res;
    }
}

fun main(){
    var d = Day10K();
    var sc = Scanner(System.`in`);
    while(true){
        println("Enter a string bud. Do it. You won't.");
        var s = sc.nextLine();
        println(d.randomSpace(s) + "\n");
    }
}