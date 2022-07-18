package UselessJava.days.Day042

import org.jetbrains.annotations.NotNull
import java.util.*

class Day42K {
    @NotNull
    private fun generateTable(): Array<Array<Long>> {
        val rows = (Math.random() * 100).toInt()
        val cols = (Math.random() * 100).toInt()
        val table: Array<Array<Long>> = Array(rows) { Array(cols) { 0 } }

        for (i in table.indices) {
            for (j in table[0].indices) {
                table[i][j] = (Math.random() * Int.MAX_VALUE).toLong()
                if ((Math.random() * 2).toInt() == 1) {
                    table[i][j] = table[i][j] * -1
                }
            }
        }
        return table
    }

    fun tableToString(): String{
        var res = ""
        val table = generateTable()
        for (longs in table) {
            for (l in longs) {
                res += String.format("%16d", l)
            }
            res += "\n"
        }
        return res
    }
}

fun main(){
    val d = Day42K()
    val sc = Scanner(System.`in`)
    while (true){
        println("Press enter/return")
        val s = sc.nextLine()
        println(d.tableToString())
    }
}