package UselessJava.Day26;

import java.util.Scanner;

public class Day26 {
    public String makeGreyscale(String s){
        s = s.replaceAll("[ \\t#]", "");
        //is s a hex code?
        if(s.matches("[\\da-f]{6}")){
            int hexcode = Integer.parseInt(s, 16);
            int r = (hexcode & 0xFF0000) >> 16;
            int g = (hexcode & 0x00FF00) >> 8;
            int b = (hexcode & 0x0000FF);
            
            String brightness = Integer.toHexString ((int)(0.299 * r + 0.597 * g + 0.114 * b));
            return  "#" + brightness + brightness + brightness;
        }
        if(s.matches("\\(\\d{1,3},\\d{1,3},\\d{1,3}\\)")){
            s = s.replaceAll("[()]", "");
            String[] strings = s.split(",");
            int[] ints = new int[strings.length];
            for(int i = 0; i < strings.length; i++) {
                ints[i] = Integer.parseInt(strings[i]);
                if(ints[i] > 255) return "Not a valid color";
            }
            String brightness = ((int)(0.299 * ints[0] + 0.597 * ints[1] + 0.114 * ints[2])) + "";
            return  "(" + brightness + ", " + brightness + ", " + brightness + ")";
        }
        return "Not a valid color";
    }
}

class Main{
    public static void main(String[] args) {
        Day26 d = new Day26();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Pride month is over, enter a color");
            String s = sc.nextLine();
            System.out.println(d.makeGreyscale(s) + "\n");
        }
    }
}