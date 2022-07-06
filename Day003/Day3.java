package UselessJava.Day003;

import java.util.Scanner;

public class Day3 {
   // determines what is the lowest primitive value your number could be.
   public String determineType(double n) {
      if((long) (n) == n) {
         long i = (long) n;
         if(i == 0 || i == 1) {return "boolean";}
         if(i >= Byte.MIN_VALUE && i <= Byte.MAX_VALUE) {return "byte";}
         if(i >= Short.MIN_VALUE && i <= Short.MAX_VALUE) {return "short";}
         if(i >= Integer.MIN_VALUE && i <= Integer.MAX_VALUE) {return "int";}
         return "long";
      }
      if(n >= Float.MIN_VALUE && n <= Float.MAX_VALUE) {return "float";}
      return "double";
   }
   
   
   public String determineType(String s) throws NumberFormatException {
      try {
         double n = Double.parseDouble(s);
         if((long) (n) == n) {
            return determineType(n);
         }
         return determineType(n);
      } catch(Exception e) {
         if(s.length() == 1) return "char";
         return "String";
      }
   }
}

class Main {
   public static void main(String[] args) throws NumberFormatException{
      Scanner sc = new Scanner(System.in);
      Day3 d = new Day3();
      while(true) {
         System.out.println("Enter a number: ");
         String s = d.determineType(sc.nextLine());
         System.out.println(s + "\n");
      }
   }
}
