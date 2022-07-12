package UselessJava.days.Day004;

import java.util.Scanner;

public class Day4 {
   public String aggressiveEcho(String s){
      char[] chars = s.toLowerCase().toCharArray();
      for(int i = 0; i < chars.length; i++) {
         if(i % 2 == 1 && chars[i] >= 'a' && chars[i] <= 'z') chars[i] -= 32;
      }
      return String.valueOf(chars);
   }
}

class Main {
   public static void main(String[] args) {
      Day4 d  = new Day4();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("What did you just say to me?");
         String s = sc.nextLine();
         System.out.println(d.aggressiveEcho(s));
         System.out.println();
      }
   }
}