package UselessJava.days.Day010;

import java.util.Scanner;

public class Day10 {
   public String randomSpace(String s){
      
      if(s == null) return s;
      
      char[] chars = s.replaceAll("[ \\t\\n]", "").toCharArray();
      String[] spaces = new String[]{"\t", "\n", "...", ", ", ". ", "? ", "! ", ": ", "; "};
      String res = "";
      for(char c : chars) {
         //random stuff :D
         res += c;
         int n = (int)(Math.random() * spaces.length * 3);
         if(n < spaces.length) res += spaces[n];
      }
      return res;
   }
}

class Main{
   public static void main(String[] args) {
      Day10 d = new Day10();
      Scanner sc = new Scanner(System.in);
      while (true){
         System.out.println("Enter a string bud. Do it. You won't.");
         String s = sc.nextLine();
         System.out.println(d.randomSpace(s) + "\n");
      }
   }
}
