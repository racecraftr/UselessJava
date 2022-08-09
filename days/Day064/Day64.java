package UselessJava.days.Day064;

import java.util.Scanner;

public class Day64 {
    public static String fastMath(String equation){
        //does math, but it isn't correct. at all. 
        //it is fast, though. 
        if(equation.matches(
            "((-*\\d+(.\\d+)*)([ \\t]*)[+\\-*/]([ \\t]*))+(-*\\d+(.\\d+)*)"
        )){
            return "" + (int)(Math.random() * Integer.MAX_VALUE);
        }
        return "not a valid equation";
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter an equation: ");
            String equation = sc.nextLine();
            System.out.println(fastMath(equation));
        } 
    }
}