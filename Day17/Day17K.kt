package UselessJava.Day17

class Day17K {
    fun generateCheckerboard(size: Int): String? {
        return generateCheckerboard(size, size)
    }


    fun generateCheckerboard(width: Int, height: Int): String? {
        //More designs include:
        /*
      Default: new String[]{"⬜","⬛"};
      Rainbows: new String[] {"🟥","🟧","🟨","🟩","🟦","🟪"}
      Anarchist: "dasfkljadklf jadslkcj sadl cjsldjf".split("");
      Amogus: "🌌ඞ".split("")
      Void: new String[] {" "}
      XO: new String[] {"x", "o"}
      add more if you want :D
       */
        val chars = arrayOf("🟥", "🟧", "🟨", "🟩", "🟦", "🟪")
        var s = ""
        for (i in 0 until height) {
            for (j in 0 until width) {
                s += chars[(i + j) % chars.size]
            }
            s += "\n"
        }
        return s
    }
}