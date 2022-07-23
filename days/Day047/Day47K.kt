package UselessJava.days.Day047

class Day47K {
    companion object{
        fun matrixFlow(){
            val rows = (Math.random() * 500).toInt()
            val cols = 10

            for (i in 0 until rows){
                var s = ""
                for(j in 0 until cols){
                    val x = (Math.random() * 100000).toInt()
                    s += "${String.format("%05d", x)} "
                }
                println(s)
                Thread.sleep(90)
            }
        }
    }
}

fun main(){
    Day47K.matrixFlow()
}
