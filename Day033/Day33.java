package UselessJava.Day033;

import java.util.Arrays;
import java.util.Scanner;

public class Day33 {
    private void shuffle (Number[] numbers){
        for(int i = 0; i < numbers.length; i++) {
            int i1 = (int)(Math.random() * numbers.length);
            int i2 = (int)(Math.random() * numbers.length);
            
            Number temp = numbers[i2];
            numbers[i2] = numbers[i1];
            numbers[i1] = temp;
        }
    }
    
    public String findPath(int number){
        Number[] numbers = new Number[Math.max(50, number * 2)];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        shuffle(numbers);
        String s = "";
        int i = number;
        while(numbers[i].intValue() != number){
            s += "numbers[" + i + "] -> " + numbers[i] + "\n";
            i = numbers[i].intValue();
        }
        s += "numbers[" + i + "] -> " + numbers[i] + "\n";
        s = "Numbers: " + Arrays.toString(numbers) + "\n" + s;
        return s;
    }
    
    public String findPath(String s){
        try {
            int d = Integer.parseInt(s);
            if(d >= 0){
                return findPath(d);
            }
            return "Not a valid number";
        } catch(NumberFormatException e){
            return "Not a valid number";
        }
    }
    
    public static void main(String[] args) {
        Day33 d = new Day33();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a positive integer.");
            String s = sc.nextLine();
            System.out.println(d.findPath(s));
        }
    }
}
