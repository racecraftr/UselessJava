package UselessJava.Day021;

import java.util.Scanner;

public class Day21 {
   public float oldSchoolRoot(float x){
      if(x < 0) {
         return Float.NaN;
      }
      if(x == 0) {
         return 0;
      }
      float low = Math.min(1, x), high = Math.max(1, x), mid = 0, i = 0;
      while(i < 25){
         mid = (low + high)/2;
         if(mid * mid == x) {
            System.out.println("√x = " + mid);
            return mid;
         }
         else if(mid * mid < x){
            low = mid;
         }
         else {
            high = mid;
         }
         System.out.println(low + " < √x < " + high);
         i++;
      }
      System.out.println("√x ≈ " + mid);
      return mid;
   }
   
   public double oldSchoolRoot(String s){
      try{
         float x = Float.parseFloat(s);
         return oldSchoolRoot(x);
      } catch(NumberFormatException e){
         return Float.NaN;
      }
   }
}

class Main{
   public static void main(String[] args) {
      Day21 d = new Day21();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter a positive number");
         String s = sc.nextLine();
         System.out.println(d.oldSchoolRoot(s));
      }
   }
}
