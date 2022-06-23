package UselessJava.Day17;

import java.util.Scanner;

public class Day17 {
   public String generateCheckerboard(int size){
      return generateCheckerboard(size, size);
   }
   
   
   public String generateCheckerboard(int width, int height){
      //More designs include:
      /*
      Rainbows: "🟥🟧🟨🟩🟦🟪".toCharArray()
      Anarchist: "dasfkljadklf jadslkcj sadl cjsldjf".toCharArray()
      Amogus: "🌌ඞ".toCharArray()
      Void: {` `}
      XO: "xo".toCharArray()
      add more if you want :D
       */
      char[] chars = new char[]{'⬜','⬛'};
      String s = "";
      for(int i = 0; i < height; i++) {
         for(int j = 0; j < width; j++) {
            s += chars[(i + j) % chars.length];
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
         if(s.matches("\\d+ *, *\\d+")){
            String[] strings = s.split(",");
            int width = Integer.parseInt(strings[0].trim());
            int height = Integer.parseInt(strings[1].trim());
            System.out.println(d.generateCheckerboard(width, height));
            continue;
         }
         try{
            int size = Integer.parseInt(s);
            System.out.println(d.generateCheckerboard(size));
         } catch(NumberFormatException e){
            System.out.println(Double.NaN);
         }
      }
   }
}