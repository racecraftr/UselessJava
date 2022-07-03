package UselessJava.Day27;

import java.util.Scanner;

public class Day27 {
    public String what (){
        String[] strings = "if and but so for it to by go get you have has is be ever".split(" ");
        String[] punctuation = ". ? ! ,".split(" ");
        String res = "";
        for(int i = 0; i < (int)(Math.random() * 100); i++) {
            res += strings[(int)(Math.random() * strings.length)];
            int punc = (int)(Math.random() * punctuation.length * 3);
            if(punc < punctuation.length) res += punctuation[punc];
            res += " ";
        }
        return  res;
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


