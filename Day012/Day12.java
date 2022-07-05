package UselessJava.Day012;

import java.util.Scanner;

public class Day12 {
   public String scared(String s){
      String[] strings = s.split("[ \\t\\n]");
      String res = "";
      for(String string : strings) {
         double n = Math.random();
         if(n > 0.5){
            for(int i = 0; i < (int)(Math.random() * 15); i++) {
               res += string.charAt(0) + "-";
            }
         }
         res += string + " ";
      }
      return  res;
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
