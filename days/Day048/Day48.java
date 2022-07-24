package UselessJava.days.Day048;

import java.util.Scanner;

public class Day48 {
    public static String brainNum(int num){
        if(num < 0) {return "[]";}
        String res = "";
        
        if(num < 8){
            
            for(int i = 0; i < num; i++) {
                res += "+";
            }
            res += ".";
            return res;
        }
        
        int n1 = 1, n2;
        for(int i = 1; i <= (int)(Math.sqrt(num)); i++) {
            if(num % i == 0){
                n1 = i;
            }
        }
        n2 = num/n1;
    
        for(int i = 0; i < n1; i++) {
            res += "+";
        }
        res += "[>";
        for(int i = 0; i < n2; i++) {
            res += "+";
        }
        
        res += "<-]>.";
        return res;
    }
    
    public static String brainNum(String s){
        try{
            int n = Integer.parseInt(s);
            return brainNum(n);
        }
        catch(Exception e){
            return null;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a positive integer");
            String s = sc.nextLine();
            System.out.println(brainNum(s));
        }
    }
}