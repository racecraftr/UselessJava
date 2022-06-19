package UselessJava.Day13;

import java.util.Scanner;

public class Day13 {
   public String decimalToFraction(double x){
      if(x == 0) return "0";
      double n = Math.abs(x);
      long d = 1;
      while(n != (long)n){
         d*= 10;
         n*= 10;
      }
      long numerator = (long)n;
      long denominator = d;
      long gcd = gcd(numerator, denominator);
      numerator/= gcd;
      denominator/= gcd;
      
      if(x < 0) numerator *= -1;
      
      if(denominator == 1) return numerator + "";
      return numerator + "/" + denominator;
   }
   
   private long gcd(long n, long d){
      long gcd = 1;
      long x = Math.max(n, d);
      for(int i = 2; i < Math.sqrt(x); i++) {
         //if i is a factor of x, then x/i is a factor of x as well. So we can find the factors in O(sqrt(x)) time.
         if(n % i == 0 && d % i == 0 && i > gcd) {
            gcd = i;
         }
         if(n % (x/i) == 0 && d % (x/i) == 0 && (x/i) > gcd) {
            gcd = x/i;
         }
      }
      return gcd;
   }
}

class Main{
   
   private static boolean isADouble(String s){
      //see if a string is a double.
      try{
         Double.parseDouble(s);
         return true;
      }catch(NumberFormatException e){
          return false;
      }
   }
   
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while (true){
         System.out.println("Enter a number or not idk");
         String s = sc.nextLine();
         if(isADouble(s)){
            System.out.println(new Day13().decimalToFraction(Double.parseDouble(s)));
         }
         else{
            System.out.println(Double.NaN);
         }
      }
   }
}
