package UselessJava.days.Day069

class Day69K {
    companion object{
        private const val NICE = 69L

        //nice
        @Throws(InterruptedException::class)
        @JvmStatic fun nice() {
            var nice = true
            while (nice) {
                println("nice")
                Thread.sleep(NICE + (Math.random() * NICE).toLong())
                if (Math.random() < 0.00069) {
                    nice = false
                }
            }
        }
    }
}

fun main(){
    Day69K.nice()
}