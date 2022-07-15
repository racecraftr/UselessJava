package UselessJava.days.Day039

import java.time.Instant

class Day39K {
    fun videoGameDaysSince(): String{
        val unixTime = Instant.now().epochSecond
        val videogameDays = longArrayOf(
            unixTime / (20 * 60),  //minecraft
            unixTime / (60 * 60 * 24),  //animal crossing
            unixTime / (60 * 60 * 12),  //pokemon sun and moon
            unixTime / (60 * 8)
        )
        return "Since Jan 1, 1970, it has been:\n" +
                "${videogameDays[0]} Minecraft Days\n" +
                "${videogameDays[1]} Animal Crossing Days\n" +
                "${videogameDays[2]} Pokemon: sun & moon Days\n" +
                "${videogameDays[3]} Don't starve Days\n"
    }
}

@kotlin.jvm.Throws
fun main(){
    val d = Day39K()
    while (true){
        println(d.videoGameDaysSince())
        Thread.sleep(1000 * 60)
    }
}