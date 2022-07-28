package UselessJava.days.Day052;

import java.util.Scanner;

public class Day52 {
    public static String minUnoCards(int points){
        
        if(points <= 0) return "none";
        
        int n = points;
        String res = "You need: \n";
        
        int fifties = n/50;
        n %= 50;
        if(fifties > 0) res += fifties + " wilds/+4s\n";
        
        int twenties = n/20;
        n %= 20;
        if(twenties > 0) res += twenties + " +2s/reverses/skips\n";
        
        for(int i = 9; i >= 1; i--) {
            int x = n/i;
            n %= i;
            if (x > 0) res += x + " " + i + "s\n";
        }
        return res;
    }
    
    public static String minUnoCards(String s){
        try{
            int x = Integer.parseInt(s);
            return minUnoCards(x);
        } catch(NumberFormatException e){
            return "Not a valid number";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a positive integer.");
            String s = sc.nextLine();
            System.out.println(minUnoCards(s));
        }
    }
}