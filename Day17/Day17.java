package UselessJava.Day17;

import java.util.Scanner;

public class Day17 {
   public String generateCheckerboard(int size){
      char[] chars = new char[]{'⬜','⬛'};
      String s = "";
      for(int i = 0; i < size; i++) {
         for(int j = 0; j < size; j++) {
            s += chars[(i + j) % 2];
         }
         s += "\n";
      }
      return s;
   }
}

class Main{
   
   public static void main(String[] args) {
      Day17 d = new Day17();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter an integer.");
         String s = sc.nextLine();
         try{
            int size = Integer.parseInt(s);
            System.out.println(d.generateCheckerboard(size));
         } catch(NumberFormatException e){
            System.out.println(Double.NaN);
         }
      }
   }
}
