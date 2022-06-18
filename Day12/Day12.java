package UselessJava.Day12;

import java.util.Scanner;

public class Day12 {
   public String scared(String s){
      s = s.trim().toUpperCase();
      char c = s.charAt(0);
      String res = "";
      for(int i = 0; i < (int)(Math.random() * 20); i++) {
         res += c + "-";
      }
      res += s;
      return res;
   }
}

class Main{
   public static void main(String[] args) {
      Day12 d = new Day12();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter something idk man");
         String s = sc.nextLine();
         System.out.println(d.scared(s));
         System.out.println();
      }
   }
}
