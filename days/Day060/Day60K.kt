package UselessJava.days.Day060

class Day60K{
    companion object{
        fun gibberish(): String? {
            var res = ""
            for (i in 0 until (Math.random() * 10).toInt() + 10) {
                for (j in 0 until (Math.random() * 20).toInt() + 1) {
                    res += ((Math.random() * 27).toInt() + 'a'.code).toChar()
                }
                res += " "
            }
            return "$res."
        }
    }
}

fun main(){
    while (true){
        println(Day60K.gibberish())
        Thread.sleep(2000)
    }
}