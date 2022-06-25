package UselessJava.Day2

import java.net.HttpURLConnection
import java.net.URL
import java.util.*

class Day2K {
    fun doesUrlExist(url: String?): Boolean {
        return try {
            val u = URL(url)
            val uc = u.openConnection()
            uc.connect()
            true
        } catch (e: Exception) {
            false
        }
    }

    fun getUrlStatusCode(url: String?): Int {
        return try {
            val u = URL(url)
            val http = u.openConnection() as HttpURLConnection
            http.responseCode
        } catch (e: Exception) {
            return -1
        }
    }

    fun printUrlStatusCode(url: String) {
        val statusCode = getUrlStatusCode(reformatURL(url))
        if (statusCode == -1) {
            println("Error: $url does not exist")
        } else {
            println("Status code: " + statusCode + " (" + getHttpResponseType(statusCode) + ")")
        }
    }

    private fun reformatURL(url: String): String? {
        return if (url.startsWith("https://")) {
            if (url.startsWith("https://www.")) {
                url
            } else url.replace("https://", "http://www.")
        } else if (url.startsWith("http://")) {
            if (url.startsWith("http://www.")) {
                url
            } else url.replace("http://", "http://www.")
        } else if (url.startsWith("www.")) {
            "https://$url"
        } else {
            "https://www.$url"
        }
    }

    private fun getHttpResponseType(response: Int): String {
        return when (response) {
            200 -> "OK"
            301 -> "Moved Permanently"
            302 -> "Found"
            304 -> "Not Modified"
            400 -> "Bad Request"
            401 -> "Unauthorized"
            403 -> "Forbidden"
            404 -> "Not Found"
            500 -> "Internal Server Error"
            501 -> "Not Implemented"
            502 -> "Bad Gateway"
            503 -> "Service Unavailable"
            504 -> "Gateway Timeout"
            else -> "Unknown"
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)
    while (true) {
        println("Enter a URL: ")
        val url = sc.nextLine()
        val d = Day2()
        d.printUrlStatusCode(url)
        println()
    }
}