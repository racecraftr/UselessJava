package UselessJava.Day020;

import java.util.Scanner;

public class Day20 {
   final String numRegex = "-*\\d*.*\\d+";
   
   public String strangeCalculator(String s){
      double d = parseEquation(s);
      if(Double.isNaN(d) || d > 4){
         return "A suffusion of yellow";
      }
      return Double.toString(d);
   }
   
   private double parseEquation (String s) {
      s = s.trim();
      s = s.replaceAll("[ \\t]", "");
   
      if(s.matches(numRegex + "\\+" + numRegex)) {
         String[] strings = s.split("\\+");
         double d1 = Double.parseDouble(strings[0]);
         double d2 = Double.parseDouble(strings[1]);
         return d1 + d2;
      }
   
      if(s.matches(numRegex + "-{1}" + numRegex)) {
         String[] strings = s.split("-");
         double d1 = Double.parseDouble(strings[0]);
         double d2 = Double.parseDouble(strings[1]);
         return d1 - d2;
      }
   
      if(s.matches(numRegex + "[*x]" + numRegex)) {
         String[] strings = s.split("[*x]");
         double d1 = Double.parseDouble(strings[0]);
         double d2 = Double.parseDouble(strings[1]);
         return d1 * d2;
      }
   
      if(s.matches(numRegex + "/" + numRegex)) {
         String[] strings = s.split("/");
         double d1 = Double.parseDouble(strings[0]);
         double d2 = Double.parseDouble(strings[1]);
         return d1 / d2;
      }
   
      if(s.matches(numRegex + "\\^" + numRegex)) {
         String[] strings = s.split("\\^");
         double d1 = Double.parseDouble(strings[0]);
         double d2 = Double.parseDouble(strings[1]);
         return Math.pow(d1, d2);
      }
   
      if(s.matches(numRegex)) {
         return Double.parseDouble(s);
      }
      return Double.NaN;
   }
}

class Main{
   public static void main(String[] args) {
      Day20 d = new Day20();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter a number.");
         String s = sc.nextLine();
         System.out.println(d.strangeCalculator(s) + "\n");
      }
   }
}
