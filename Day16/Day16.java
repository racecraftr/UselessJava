package UselessJava.Day16;

import java.util.Scanner;

public class Day16 {
   public long sumOfString(String s){
      long sum = 0;
      String digits = s.replaceAll("\\D", "");
      for(int i = 0; i < digits.length(); i++) {
         sum += (digits.charAt(i) - 48);
      }
      return sum;
   }
}

class Main{
   public static void main(String[] args) {
      Day16 d = new Day16();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter a string");
         String s = sc.nextLine();
         System.out.println(d.sumOfString(s));
      }
   }
}
