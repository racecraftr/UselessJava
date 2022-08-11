package UselessJava.days.Day066

class Day66K {
    companion object {
        @JvmStatic val chars = "qwertyuiopasdfghjklzxcvbnm,. \n".toCharArray();

        fun monkeys(){
            while(true){
                print(chars[(Math.random() * chars.size).toInt()])
                Thread.sleep(50 + (Math.random() * 100).toLong())
            }
        }
    }
}
fun main() {
    Day66K.monkeys()
}