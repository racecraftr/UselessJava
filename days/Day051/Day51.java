package UselessJava.days.Day051;

import java.util.Scanner;

public class Day51{
    private static String shuffle(String s){
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            int i1 = (int)(Math.random() * chars.length);
            int i2 = (int)(Math.random() * chars.length);
            
            char temp = chars[i1];
            chars[i1] = chars[i2];
            chars[i2] = temp;
        }
        return new String(chars);
    }
    
    static String kindaSorta(String s){
        String[] strings = s.split("[ \\t]");
        String res = "";
        for(String string : strings) {
            if(string.length() <= 3){
                res += string;
            } else {
                String shuffled = string.charAt(0) + shuffle(string.substring(1, string.length() - 1)) + string.charAt(string.length() - 1);
                res += shuffled;
            }
            res += " ";
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string");
            String s = sc.nextLine();
            System.out.println(kindaSorta(s));
        }
    }
}