package UselessJava.days.Day065

class Day65K {
    companion object {
        @JvmStatic fun wholeLotOfNothing() {
            for(i in 0..0){
                val b = false
                while(b){println()}
            }
            val b = false;
             if(b){
                println()
            }
            val t = Thread({
                for(i in 0..0){
                    for(j in 0..0){
                        val bool = false
                        while(bool){println()}
                    }
                }
            })
            t.start()
            t.join()
            val ints = IntArray(0)
            for(i in ints){
                val bool = false
                do{
                    println()
                } while(bool)
            }
            println()
            return;
        }
    }
}

fun main() {
    Day65K.wholeLotOfNothing()
}
