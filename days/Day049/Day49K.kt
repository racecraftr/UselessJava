package UselessJava.days.Day049

import java.util.*

class Day49K{
    companion object{
        private val BOGGLE_DIE = ArrayList<BoggleDiceK>(
            listOf(
            BoggleDiceK("aaafrs"),
            BoggleDiceK("aaeeee"),
            BoggleDiceK("aafirs"),
            BoggleDiceK("adennn"),
            BoggleDiceK("aeeeem"),
            BoggleDiceK("aeegmu"),
            BoggleDiceK("aegmnn"),
            BoggleDiceK("afirsy"),
            BoggleDiceK("bjkqxz"),
            BoggleDiceK("ccenst"),
            BoggleDiceK("ceiilt"),
            BoggleDiceK("ceilpt"),
            BoggleDiceK("ceipst"),
            BoggleDiceK("ddhnot"),
            BoggleDiceK("dhlnor"),
            BoggleDiceK("dhlnor"),
            BoggleDiceK("eiiitt"),
            BoggleDiceK("emottt"),
            BoggleDiceK("fiprsy"),
            BoggleDiceK("gorrvw"),
            BoggleDiceK("iprrry"),
            BoggleDiceK("nootuw"),
            BoggleDiceK("ooottu")
        )
        )

        fun randomBoggle(): String{
            val boggleDice = ArrayList<BoggleDiceK>(BOGGLE_DIE)
            var res = ""
            for(i in 0 until 5){
                for(j in 0 until 5){
                    val n = (Math.random() * boggleDice.size).toInt()
                    val option = boggleDice[n].getRandomOption()
                    res += "$option "
                    boggleDice.removeAt(n)
                }
                res += "\n"
            }
            return res
        }
    }
}

fun main(){
    val sc = Scanner(System.`in`)
    while(true){
        println("Press enter to generate.")
        val s = sc.nextLine()
        println(Day49K.randomBoggle())
    }
}

class BoggleDiceK(s: String){
    var chars = s.uppercase().toCharArray()

    fun getRandomOption(): String{
        val c = chars[(Math.random() * chars.size).toInt()]
        if(c == 'Q') return "Qu";
        return " $c"
    }
}