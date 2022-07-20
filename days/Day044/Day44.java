package UselessJava.days.Day044;

import java.util.Arrays;
import java.util.Scanner;

public class Day44 {
    public int[] randomPyTriple(){
        /*
        you can generate a random pythagorean triple by squaring a complex number.
        real and imaginary parts - legs
        absolute value - hypotenuse
         */
        int real = (int)(Math.random() * 1000) + 1;
        int imaginary = (int)(Math.random() * 1000) + 1;
        
        int leg1 = Math.abs(real * real - imaginary * imaginary);
        int leg2 = Math.abs(2 * real * imaginary);
        int hypo = (int)(Math.sqrt(leg1 * leg1  + leg2 * leg2));
        return new int[]{leg1, leg2, hypo};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Day44 d = new Day44();
        while(true){
            System.out.println("Press enter/return.");
            String s = sc.nextLine();
            System.out.println(Arrays.toString(d.randomPyTriple()));
        }
    }
}
