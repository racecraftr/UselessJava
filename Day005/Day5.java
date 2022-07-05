package UselessJava.Day005;

import java.util.Scanner;

public class Day5 {
   public String leetCoder(String s){
      
      String res = s;
      
      res = res.replaceAll("((?i)(ate))", "8");
      res = res.replaceAll("(?i)(\\bdub)", "w");
      res = res.replaceAll("[Ili]", "1");
      res = res.replaceAll("(?i)(too|to)", "2");
      
      res = res.replaceAll("[Ee]", "3");
      res = res.replaceAll("A", "4");
      res = res.replaceAll("[Ss]", "5");
      res = res.replaceAll("L", "7");
      res = res.replaceAll("g", "9");
      res = res.replaceAll("[Oo]", "0");
      res = res.replaceAll("B", "8");
      
      return res;
   }
}

class Main{
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Day5 d = new Day5();
      
      while(true){
         System.out.println("Enter a string:");
         String s = sc.nextLine();
         System.out.println(d.leetCoder(s));
         System.out.println();
      }
   }
}