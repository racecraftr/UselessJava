package UselessJava.Day22;

import java.util.Scanner;

public class Day22 {
   public String hackerBackground(long length, long magnitude){
      String res = "";
      for(int i = 0; i < length; i++) {
         long n = (long)(Math.pow(2, magnitude - 1) + Math.random()*Math.pow(2, magnitude -1));
         String s = Long.toBinaryString(n);
         if(Math.random() >= 0.5){
            s = "0" + s.substring(1);
         }
         res += s + "\n";
      }
      return res;
   }
   
   public String hackerBackground(String s){
      s = s.replaceAll("[ \\t]", "");
      if(s.matches("\\d+,\\d+")){
         String[] strings = s.split(",");
         long l1 = Long.parseLong(strings[0]);
         long l2 = Long.parseLong(strings[1]);
         return hackerBackground(l1, l2);
      }
      if(s.matches("\\d+")){
         return hackerBackground(Long.parseLong(s), 8);
      }
      return Double.toString(Double.NaN);
   }
}

class Main {
   public static void main(String[] args) {
      Day22 d = new Day22();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter something idc");
         String s  = sc.nextLine();
         System.out.println(d.hackerBackground(s));
      }
   }
}


