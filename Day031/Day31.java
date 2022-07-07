package UselessJava.Day031;

import UselessJava.Day003.Day3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day31 {
    
    final Day3 determiner = new Day3(); // meta-uselessness
    final List<String> types = Arrays.asList(
            "boolean",
            "byte",
            "short",
            "int",
            //instead of making the code better, I am telling everyone to accept this:
            //all chars are ints and all ints are chars. Deal with it.
            //Therefore, chars take higher priority than ints, but lower priorities than longs. easy peasy
            //"But racecraftr, chars are bytes?" Then why do we have emoticons? checkmate :)
            
            //because all chars are ints, then all chars are - by definition - longs, floats, doubles, and strings.
            //live with it lol
            "char",
            "long",
            "float",
            "double",
            "String"
                                            );
    
    public String arrayType(String s){
        int magnitude = 0;
        s = s.trim();
        s = s.replaceAll(",[ \\t]+", "");
        s = s.replaceAll("(^\\[|^\\(|\\]$|\\)$)", "");
        String[] strings = s.split(",");
        for(String str : strings) {
            if(types.contains(determiner.determineType(str))) {
                magnitude = Math.max(magnitude,
                                     types.indexOf(determiner.determineType(str)));
            }
        }
        return types.get(magnitude);
    }
    
    public static void main(String[] args) {
        Day31 d = new Day31();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter an array");
            String s = sc.nextLine();
            System.out.println(d.arrayType(s) + "\n");
        }
    }
}
