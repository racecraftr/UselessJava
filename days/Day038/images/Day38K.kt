package UselessJava.days.Day038.images

import java.awt.Color
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO


class Day38K {
    val root = "days/Day038/images/"

    val files = arrayOf("0.jpg")

    var shades = arrayOf(
        "▓▒░",
        "@%#*+=-:. ",
        "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~i!lI;:,\"^`."
    )

    @Throws(IOException::class)
    fun imageToString(imageFile: String?): String {

        var resolution = 10
        val detail = 1

        val chars = shades[detail].toCharArray()
        if (resolution < 1) resolution = 1 //can never be too sure :/

        val file = imageFile?.let { File(it) }
        val img = ImageIO.read(file)
        var res = ""

        //intellij it was a simple for loop was it really that hard
        var i = 0
        while (i < img.height) {
            var j = 0
            while (j < img.width) {
                val p = img.getRGB(j, i)
                val color = Color(p, true)
                val r = color.red
                val g = color.green
                val b = color.blue
                val s = (.3 * r + .59 * g + .11 * b).toInt()
                val index = (s / 255.0 * chars.size).toInt()
                //System.out.println(s + "-> " + index);
                res += chars[index]
                j += resolution //oh yeah that
            }
            res += "\n"
            i += resolution
        }
        return res
    }
}

@Throws(IOException::class)
fun main() {
    val d = Day38K()
    println(d.imageToString(d.root + d.files[0]))
}