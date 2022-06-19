package UselessJava.Day13;

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
      long gcf = 1;
      if(d == 0) return n;
      else return gcd(d, n % d);
   }
}

class Main{
   public static void main(String[] args) {
      Day13 d = new Day13();
      System.out.println(d.decimalToFraction(1.5));
      System.out.println(d.decimalToFraction(15));
      System.out.println(d.decimalToFraction(10.1));
      System.out.println(d.decimalToFraction(1.3));
      System.out.println(d.decimalToFraction(2.4));
      System.out.println(d.decimalToFraction(1.625));
   }
}
