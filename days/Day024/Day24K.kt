package UselessJava.days.Day024

import java.io.IOException
import java.net.HttpURLConnection
import java.net.URL
import java.util.*

class Day24K {
    @Throws(IOException::class)
    private fun doesUserExist(username: String, website: String): Boolean {
        val url = URL("https://www.$website.com/$username")
        return try {
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"
            connection.connect()
            val code = connection.responseCode
            code >= 200 && code < 400
        } catch (e: IOException) {
            false
        }
    }

    @Throws(IOException::class)
    fun doesUserExist(username: String): String? {
        var b = false
        if (username.startsWith("u/")) {
            b = doesUserExist(username, "reddit")
        }
        if (username.startsWith("tw@")) {
            b = doesUserExist(username.replace("tw@", ""), "twitter")
        }
        if (username.startsWith("ig@")) {
            b = doesUserExist(username.replace("ig@", "") + "/", "instagram")
        }
        if (username.startsWith("tt@")) {
            b = doesUserExist(username.replace("tt", ""), "tiktok")
        }
        return if (b) "User exists" else "User does not exist"
    }
}

fun main(){
    val d = Day24K()
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter a username.")
        val s = sc.nextLine()
        println(
            """
            ${d.doesUserExist(s)}
            
            """.trimIndent()
        )
    }
}