package UselessJava.days.Day068;

import java.util.Scanner;

public class Day68 {
    static String coinFlip(int times){
        times = Math.max(times, 1);
        String s = "";
        int heads = 0, tails = 0;
        for (int i = 0; i < times; i++) {
            if(Math.random() > 0.5){
                heads ++;
                s += "H";
            }
            else{
                tails ++;
                s += "T";
            }
        }
        return s + 
        "\nChance of heads: " + (heads * 1.0 / times) + 
        "\nChance of tails: " + (tails * 1.0 / times) + 
        "\nFairness: " + (1.0 - Math.abs(heads - tails)/(times * 1.0));
    }

    static String coinFlip(String s){
        try{
            s = s.trim();
            int n = Integer.parseInt(s);
            return coinFlip(n);
        }
        catch(Exception e){
            return "NaN";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number.");
            String s = sc.nextLine();
            System.out.println(coinFlip(s));
        }
    }
}