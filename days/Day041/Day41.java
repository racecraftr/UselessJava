package UselessJava.days.Day041;

import java.util.Scanner;

public class Day41 {
    public String toUnicode(String s){
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            int n = s.charAt(i);
            res += "U+" + String.format("%04x", n).toUpperCase();
            if((i + 1) % 10 == 0){
                res += "\n";
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Day41 d = new Day41();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string: ");
            String s = sc.nextLine();
            System.out.println(d.toUnicode(s) + "\n");
        }
    }
}
