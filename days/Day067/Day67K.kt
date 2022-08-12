package UselessJava.days.Day067

import java.util.Date
import java.text.SimpleDateFormat

class Day67K {
    companion object {
        @JvmStatic fun wierdFormat(): String {
            val date = Date()
            val format  = SimpleDateFormat("MMMM-yyyy-dd a->ss->mm->hh")
            return format.format(date)
        }
    }
}

fun main(){
    while(true){
        println(Day67K.wierdFormat())
        Thread.sleep(1000L * 60L)
    }
}