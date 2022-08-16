package UselessJava.days.Day070;

import java.util.Scanner;

public class Day70 {
    static String bars(int height){
        char block = '█';
        int start = (int)(Math.random() * 64);
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < height; i++) {
            res.append(String.valueOf(block).repeat(Math.max(0, start)));
            res.append('\n');
            
            start += (int)(Math.random() * 10) - 5;
            start = Math.max(start, 1);
            start = Math.min(start, 64);
        }
        return res.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a number.");
            try {
                int x = sc.nextInt();
                System.out.println(bars(
                        Math.max(1, x)
                                       ));
            } catch(Exception e){
                System.out.println("Not a valid number");
            }
        }
    }
}