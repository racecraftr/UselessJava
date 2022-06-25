package UselessJava.Day19;

import java.util.Scanner;

public class Day19 {
   final String[] moveArray = "U U2 D D2 L L2 R R2 F F2 B B2 U' D' L' R' F' B' x y z M E S x' y' z' M' E' S' r r2 f f2 b b2 r' f' b'".split(" ");
   public String createScrambleSequence(int moves) {
      String res = "";
      for(int i = 0; i < moves; i++) {
         res += moveArray[(int)(Math.random() * moveArray.length)] + " ";
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
