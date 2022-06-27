package UselessJava.Day18

class Day18K {
    fun detectCosmicRay(): String? {
        val comments = arrayOf(
            "Why are you still here?",
            "Most systems automatically fix errors caused by cosmic rays.",
            "This is so stupid.",
            "Based off of a reddit post by u/TripplerX.",
            "I did nawt kill her, I did naaawt! Oh hai Mark.",
            "The cheese stands alone, so sad :(",
            "???",
            "Why are we still here... just to suffer..."
        )
        val t = Thread {
            while (true) {
                try {
                    println(comments[(Math.random() * comments.size).toInt()])
                    Thread.sleep(3000)
                } catch (e: InterruptedException) {
                    throw RuntimeException(e)
                }
            }
        }
        t.start()
        val b = true
        while (b) {
        }
        t.interrupt()
        return "Cosmic ray detected"
    }
}

fun main(args: Array<String>) {
    val d = Day18K()
    println(d.detectCosmicRay())
}