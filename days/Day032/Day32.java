package UselessJava.days.Day032;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Scanner;

public class Day32 {
    public String weirdSort(String s){
        String[] strings = s.split(",");
        CustomString[] customStrings = new CustomString[strings.length];
        for(int i = 0; i < strings.length; i++) {
            customStrings[i] = new CustomString(strings[i]);
        }
        Arrays.sort(customStrings);
        return Arrays.toString(customStrings);
    }
    
    public static void main(String[] args) {
        Day32 d = new Day32();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter an array of strings.");
            String s = sc.nextLine();
            System.out.println(d.weirdSort(s));
        }
    }
}

class CustomString implements Comparable{
    String s;
    int value;
    public CustomString(String s){
        this.s = s;
        for(int i = 0; i < s.length(); i++) {
            value += s.charAt(i);
        }
    }
    
    @Override
    public int compareTo(@NotNull Object o) {
        return this.value - ((CustomString)o).value;
    }
    
    @Override
    public String toString() {
        return s;
    }
}
