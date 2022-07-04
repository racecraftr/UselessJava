package UselessJava.Day27;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Day27 {
    public String what (){
        String[] punctuation = ". ? ! ,".split(" ");
        String res = "";
        for(int i = 0; i < (int)(Math.random() * 100); i++) {
            res += getRandomLine();
            int punc = (int)(Math.random() * punctuation.length * 3);
            if(punc < punctuation.length) res += punctuation[punc];
            res += " ";
        }
        return  res;
    }
    
    private String getRandomLine() {
        ArrayList<String> lines;
        try {
            lines = (ArrayList<String>) Files.readAllLines(Paths.get("./Day27/words.txt"));
        }
        catch(IOException e) {
            e.printStackTrace();
            return "";
        }
    
        Random random = new Random();
        return lines.get(random.nextInt(lines.size()));
    }
    
    //i'm going to put the main method inside the class to make things easier from now on. Only took 27 days to do lol
    public static void main(String[] args) {
        Day27 d = new Day27();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("press enter to generate");
            String s = sc.nextLine();
            System.out.println(d.what() + "\n");
        }
    }
}


