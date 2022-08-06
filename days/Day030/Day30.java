package UselessJava.days.Day030;

import java.util.Scanner;

public class Day30 {
   public String redditChain(String message){
       if(message.equals(":moai:")) message = "\uD83D\uDDFF";
       String prefix = "";
       String res = "";
       int points = 1000 + (int)(Math.random() * 9000);
       for(int i = 0; i < (int)(Math.random() * 200); i++) {
           res += prefix + message + " [+" + points + "]\n";
           prefix += "|\t";
           points -= (int)(Math.random() * points);
           points = Math.max(points, 1);
       }
       return res;
   }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day30 d = new Day30();
        while(true){
            System.out.println("Enter a string");
            String s = sc.nextLine();
            System.out.println(d.redditChain(s));
        }
    }
}
/*
hello from vim! I made this comment using the vim editor on my 2017 Macbook pro. 
Can't believe this works. It even has syntax hilighting! :D
Gonna just.. chill for a bit in this. It's so interesting. 
To exit vim, simply enter [esc] :wq 
*/
