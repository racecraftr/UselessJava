package UselessJava.days.Day037;

import java.util.Scanner;

public class Day37 {
    public void bruteForce(String s) throws InterruptedException {
        char[] chars = s.toCharArray();
        String res = "";
        for(char c : chars) {
            int n = ' ';
            while(n != c){
                System.out.println(res + ((char)n));
                n++;
                Thread.sleep(10);
            }
            System.out.println(res + c);
            res += c;
        }
        return;
    }
    
    public static void main(String[] args) throws InterruptedException {
        Day37 d = new Day37();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string");
            String s = sc.nextLine();
            d.bruteForce(s);
        }
    }
}
