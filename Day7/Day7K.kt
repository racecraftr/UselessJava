package UselessJava.Day7

import java.awt.Color
import java.io.File
import java.io.IOException
import javax.imageio.ImageIO

class Day7K {
    @Throws(IOException::class)
    fun averageColor(imageFile: String): String? {
        val file = File(imageFile).absoluteFile
        val img = ImageIO.read(file)
        var r: Long = 0
        var g: Long = 0
        var b: Long = 0
        val size = img.height * img.width
        for (i in 0 until img.height) {
            for (j in 0 until img.width) {
                val color = Color(img.getRGB(j, i), true)
                r += color.red.toLong()
                g += color.green.toLong()
                b += color.blue.toLong()
            }
        }
        r /= size.toLong()
        g /= size.toLong()
        b /= size.toLong()
        return "file: $imageFile \nAverage color: ($r, $g, $b)"
    }
}

var root = "/Users/avi/code/personalStuff/src/UselessJava/Day7/testImages/" //absolute root path to folder containing images

var files = arrayOf("test-1.jpeg") //array to store image names for quick and easy access to different images


@Throws(IOException::class)
fun main(args: Array<String>) {
    val day7 = Day7()
    println(day7.averageColor(root + files[0]))
}