package UselessJava.days.Day058;

import java.util.Scanner;

public class Day58 {
    static String wordString = "ok so um hi hello yes uh erm yeah hmm and";
    static String[] words = wordString.split(" ");
    
    static String nervous(String s){
        StringBuilder res = new StringBuilder();
        String[] strings = s.split("[ \\t]");
    
        for(String string : strings) {
            for(int j = 0; j < (int) (Math.random() * 12); j++) {
                res.append(words[(int) (Math.random() * words.length)]).append(" ");
            }
            res.append(string).append(" ");
        }
        for(int j = 0; j < (int)(Math.random() * 12); j++) {
            res.append(words[(int) (Math.random() * words.length)]).append(" ");
        }
        return res.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Ok um enter a string and um I will try to say it um ok yeah thanks");
            String s = sc.nextLine();
            System.out.println(nervous(s));
        }
    }
}