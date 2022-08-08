package UselessJava.days.Day063;

import java.util.Scanner;

public class Day63 {
    public static boolean isNotPalindrome(String s) {
        return !isPalindrome(s);
    }
    public static boolean isPalindrome(String s) {
        s1 = s.toLowerCase();
        s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
        return s1.equals(new StringBuilder(s1).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number.");
            String s = sc.nextLine();
            System.out.println(isNotPalindrome(s));
        }
    }
}