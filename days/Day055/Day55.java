package UselessJava.days.Day055;

import java.util.Scanner;

public class Day55 {
    
    static String[] pieces = " r N B N Q".split(" ");
    
    private static String randomChessMoves(int moves){
        moves = Math.max(1, moves);
        String res = "";
        for(int i = 0; i < moves; i++) {
            res += generateRandomMove() + "\n";
        }
        return res;
    }
    
    static String randomChessMoves(String s){
        try {
            int moves = Integer.parseInt(s);
            return randomChessMoves(moves);
        }
        catch(NumberFormatException e){
            return "Not a valid number";
        }
    }
    
    private static String generateRandomMove(){
        String res = "";
        res += pieces[(int)(Math.random() * pieces.length)];
        
        if(Math.random() <= 0.5){
            if(res.equals("")) res += (char)((int)(Math.random() * 8) + 'a');
            res += "x";
        }
    
        res += (char)((int)(Math.random() * 8) + 'a');
        res += (int)(Math.random() * 8 + 1);
        
    
        if(Math.random() <= 0.05) res =  "O-O";
        if(Math.random() <= 0.1) res = "O-O-O";
        
        if(Math.random() <= 0.25) res += "+";
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number.");
            String s = sc.nextLine();
            System.out.println(randomChessMoves(s));
        }
    }
}