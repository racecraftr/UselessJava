package UselessJava.days.Day034

import java.util.*

class Day34K {
    val responses = arrayOf(
        "It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes definitely",
        "You may rely on it",
        "As I see it yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes",
        "Reply hazy try again",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "My reply is no",
        "My sources say no",
        "Outlook not so good",
        "Very doubtful"
    )

    val startQuestions = arrayOf(
        "am", "is", "will", "do", "should", "could"
    )

    fun magic8Ball(question: String): String {
        var question = question
        question = question.lowercase()
        var validQuestion = false
        for (s in startQuestions) {
            if (question.startsWith(s)) {
                validQuestion = true
                continue
            }
        }
        return if (!validQuestion) "> Not a valid question, please try again" else "> " + responses[(Math.random() * responses.size).toInt()]
    }
}

fun main(){
    val d = Day34K()
    val sc = Scanner(System.`in`);
    while (true){
        println("Ask the magic 8 ball a question.")
        val s = sc.nextLine();
        println(d.magic8Ball(s))
    }
}