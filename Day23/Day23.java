package UselessJava.Day23;

import java.util.Locale;
import java.util.Scanner;

public class Day23 {
    public String findComplement(String color){
        color = color.toLowerCase(Locale.ROOT);
        color = color.replaceAll("[ \\t]", "");
        if(color.matches("#*[\\da-f]{6}")){
            color = color.replaceAll("#", "");
            int s = (0xFFFFFF - Integer.parseInt(color, 16));
            return "#" + String.format("%06X", s);
        }
        if(color.matches("\\(\\d{1,3},\\d{1,3},\\d{1,3}\\)")){
            color = color.replaceAll("[()]", "");
            String[] strings = color.split(",");
            int[] ints = new int[strings.length];
            for(int i = 0; i < strings.length; i++) {
                int n = Integer.parseInt(strings[i]);
                if(n > 0xFF || n < 0) return "Not a valid color";
                ints[i] = 0xFF - n;
            }
            return "(" + ints[0] + ", " + ints[1] + ", " + ints[2] + ")";
        }
        return "Not a valid color";
    }
}

class Main{
    public static void main(String[] args) {
        Day23 d = new Day23();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a color.");
            String s = sc.nextLine();
            System.out.println(d.findComplement(s) + "\n");
        }
    }
}
