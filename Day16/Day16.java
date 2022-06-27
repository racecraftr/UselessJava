package UselessJava.Day16;

import java.util.Scanner;

public class Day16 {
   public long sumOfString(String s){
      long sum = 0;
      String[] strings = s.split("\\D");
      for(String string : strings) {
         if(string.length() > 0) {
            long n = Long.parseLong(string);
            sum += n;
         }
      }
      return sum;
   }
}

class Main{
   public static void main(String[] args) {
      Day16 d = new Day16K();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter a string");
         String s = sc.nextLine();
         System.out.println(d.sumOfString(s));
      }
   }
}
