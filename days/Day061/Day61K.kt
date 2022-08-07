package UselessJava.days.Day061

class Day61K {
    companion object{
        @JvmStatic
        fun instaCrash(){
            val t = Thread(){
                println("Fork bomb lol")
		instaCrash()
            }
            val t1 = t;
            t.start()
            t1.start()
        }
    }
}

fun main(){
    Day61K.instaCrash()
}
