package UselessJava.days.Day015;

import java.util.Scanner;

public class Day15 {
   public boolean hasHiddenRickRoll(String s){
      String test = s.replaceAll("[ \\t\\n]", "");
      String rickroll = "nevergonnagiveyouup";
      String regex = ".*";
      for(int i = 0; i < rickroll.length(); i++) {
         regex += rickroll.charAt(i) + ".*";
      }
      return test.toLowerCase().matches(regex);
   }
}

class Main{
   public static void main(String[] args) {
      Day15 d = new Day15();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter a string lol");
         String s = sc.nextLine();
         if(d.hasHiddenRickRoll(s)) {
            System.out.println("there is a rickroll, be careful");
         }
         else {System.out.println("no rickroll, you are safe for now");}
      }
   }
}
