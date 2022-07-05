package UselessJava.Day022;

import java.util.Scanner;

public class Day22 {
   public String hackerBackground(long length, long magnitude){
      String res = "";
      for(int i = 0; i < length; i++) {
         for(int j = 0; j < magnitude; j++) {
            res += (int)(Math.random() * 2);
         }
         res += "\n";
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


