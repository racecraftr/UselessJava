package UselessJava.Day19;

import java.util.Scanner;

public class Day19 {
   final String[] moveArray = "U D L R F B x y z M E S u d l r f b".split(" ");
   final String[] addons = " 2 '".split(" ");
   public String createScrambleSequence(int moves) {
      String res = "";
      for(int i = 0; i < moves; i++) {
         res += moveArray[(int)(Math.random() * moveArray.length)];
         res += addons[(int)(Math.random() * addons.length)];
      }
      return res;
   }
   
   public String createScrambleSequence(String s) {
      try{
         int moves = Integer.parseInt(s);
         return createScrambleSequence(moves);
      }
      catch(NumberFormatException e){
         return Double.NaN + "";
      }
   }
}

class Main{
   public static void main(String[] args) {
      Day19 d = new Day19();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter a number.");
         String s = sc.nextLine();
         System.out.println(d.createScrambleSequence(s) + "\n");
      }
   }
}
