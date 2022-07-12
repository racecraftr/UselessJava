package UselessJava.days.Day036;

import java.util.Scanner;

public class Day36 {
    public char averageChar(String s){
        char[] chars = s.toCharArray();
        int n = 0;
        for(char aChar : chars) {
            n += aChar;
        }
        n /= chars.length;
        return (char)n;
    }
    
    public static void main(String[] args) {
        Day36 d = new Day36();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string.");
            String s = sc.nextLine();
            System.out.println(d.averageChar(s));
        }
    }
}
