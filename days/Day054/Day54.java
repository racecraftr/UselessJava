package UselessJava.days.Day054;

import java.util.Scanner;

public class Day54 {
    static String catOverKeyboard(String s){
        //you are typing something. Suddenly, a cat runs over your keyboard and ruins what you were typing!
        String res = s.substring(0, s.length() - (int)(Math.random() * s.length()/2));
        for(int i = 0; i < (int)(Math.random() * 150) + 50; i++) {
            char c = (char)(32 + (int)(Math.random() * 95));
            res += c;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string.");
            String s = sc.nextLine();
            System.out.println(catOverKeyboard(s));
        }
    }
}