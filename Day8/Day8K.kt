package UselessJava.Day8

class Day8K {
    fun countStrokes(s: String): String? {
        //all characters found on a standard QWERTY keyboard are included.
        var strokes = 0
        var dots = 0
        var holes = 0
        for (i in 0 until s.length) {
            val c = s[i].toString() + ""
            /*
         count strokes. there are 4 different types of strokes:
         humps and bumps (u, n)
         doughnuts (0, O, o)
         straight lines (T, L, M, W)
         tails (J, j)

         each instance of these is a stroke.
         the strokes will be counted based on the common strokes used in the american-english print writing style.
         dots do not count as strokes, as the writing instrument is more or less stamped rather than moved in a line.
          */if (c.matches(Regex("[oOl689\\-_/\\\\|',UiSsJj;Cc?`~!()&]"))) strokes += 1
            if (c.matches(Regex("[237QqerTtyuIPpaDdfGghLXxVvbn=+{}<>@$^]"))) strokes += 2
            if (c.matches(Regex("[145WwERYIFHKZBNM\\[\\]*%]"))) strokes += 3
            if (c.matches(Regex("[#]"))) strokes += 4

            /*
         count holes. examples:
         9 - 1 hole
         0 - 1 hole
         8 - 2 holes
         88 - 4 holes
         p - 1 hole
         A - 1 hole
         a - 1 hole

         A hole is where a doughnut appears or where the open end of a hump/bump is closed by a stick or line.
         It can also be where three sticks and lines form a polygon.
          */if (c.matches(Regex("[690QqeROoPpAaDdgb]"))) holes += 1
            if (c.matches(Regex("[8B%&]"))) holes += 2

            /*
         count dots.
         i - 1 dot
         : - 2 dots
         ; - 1 dots (the comma counts as a stroke)
          */if (c.matches(Regex("[!ij;.?]"))) dots += 1
            if (c.matches(Regex("[:]"))) dots += 2
        }
        return "There are $strokes strokes, $holes holes, and $dots dots."
    }
}