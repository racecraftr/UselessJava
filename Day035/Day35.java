package UselessJava.Day035;

import java.util.Scanner;

public class Day35 {
    final char[] patternChars = "▖▗▘▙▚▛▜▝▞▟█".toCharArray();
    public String generatePattern(int width, int length){
        String res = "";
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < width; j++) {
                res += patternChars[(int)(Math.random() * patternChars.length)];
            }
            res += "\n";
        }
        return res;
    }
    
    public String generatePattern(String s){
        s = s.replaceAll("[^,\\d]", "");
        if(s.matches("\\d+,\\d+")){
            String[] strings = s.split(",");
            int i1 = Integer.parseInt(strings[0]);
            int i2 = Integer.parseInt(strings[1]);
            return generatePattern(i1, i2);
        }
        try{
            int i = Integer.parseInt(s);
            return generatePattern(i, i);
        } catch(NumberFormatException e){
            return "Not a valid number";
        }
    }
    
    public static void main(String[] args) {
        Day35 d = new Day35();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("enter a number.");
            String s = sc.nextLine();
            System.out.println(d.generatePattern(s));
        }
    }
}
