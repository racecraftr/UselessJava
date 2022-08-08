package UselessJava.days.Day063

class Day63K {
    companion object {
        fun isPalindrome(s: String): Boolean {
            val s1 = s.lowercase()
            val s2 = s1.replace("[^a-zA-Z0-9]".toRegex(), "")
            return s2 == s2.reversed()
        }

        fun isNotPalindrome(s: String): Boolean {
            return !isPalindrome(s)
        }
    }
}

fun main(){
    while(true){
        println("Enter a string: ")
        val s = readLine()!!
        println(Day63K.isNotPalindrome(s))
    }
}