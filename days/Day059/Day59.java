package UselessJava.days.Day059;

import java.util.Scanner;

public class Day59 {
    static String[] keys = {
      "asdfjkl; ",
      "qwertyuiopghzxcvbnm,.['/ASDFJKL:",
      "QWERTYUIOPGHZXCVBNM<>\"?1234567890-]",
      "]`!@#$%^&*()=!@#$%^&*()_",
      "\\~",
      "|"
    };
    
    static double averageFingerDistance(String s){
        double d = 0;
        char[] chars = s.toCharArray();
        for(char c : chars) {
            for(int i = 0; i < keys.length; i++) {
                if(keys[i].indexOf(c) >= 0) {
                    d += i;
                    break;
                }
            }
        }
        d /= chars.length;
        return d;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string.");
            String s = sc.nextLine();
            System.out.println("On a standard QWERTY Keyboard, your fingers had to travel an average of " + averageFingerDistance(s) + " keywidths away.");
        }
    }
}
