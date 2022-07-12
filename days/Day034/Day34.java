package UselessJava.days.Day034;

import java.util.Locale;
import java.util.Scanner;

public class Day34 {
    final String[] responses = new String[]{
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
    };
    
    final String[] startQuestions = new String []{
            "am", "is", "will", "do", "should", "could",
    };
    
    public String magic8Ball(String question){
        question = question.toLowerCase(Locale.ROOT);
        boolean validQuestion = false;
        for(String s : startQuestions) {
            if(question.startsWith(s)){
                validQuestion = true;
                continue;
            }
        }
        if(!validQuestion) return "> Not a valid question, please try again";
        return "> " + responses[(int)(Math.random() * responses.length)];
    }
    
    public static void main(String[] args) {
        Day34 d = new Day34();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ask the magic 8 ball a question.");
            String s = sc.nextLine();
            System.out.println(d.magic8Ball(s));
        }
    }
}
