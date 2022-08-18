package UselessJava.days.Day073;

import java.util.Scanner;

public class Day73 {
  static String[] emojis =
          "\uD83E\uDD70 \uD83D\uDE0D \uD83E\uDD29 \uD83D\uDE18 \uD83D\uDE17 \uD83E\uDD11 \uD83E\uDD17 \uD83E\uDD75 \uD83D\uDE31 \uD83D\uDC9D \uD83D\uDC95 \uD83D\uDC4B \uD83D\uDE4B\u200D\u200D \uD83D\uDE4B\u200D\u200D"
                  .split(" ");
  static String mlm(String s){
    /* for context, mlm does NOT mean "men loving men"
    it means "multi level marketing."
    People in MLMs will often advertise to you in a...certain way. */
    
    String[] words = s.split("[ \\t]");
    String res = "";
    for(String word : words) {
      res += word + " ";
      if(Math.random() < 1.0/3){
        for(int i = 0; i < (int)(Math.random() * 10); i++) {
          res += emojis[(int)(Math.random() * emojis.length)];
        }
        res += " ";
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter a string.");
      String s = sc.nextLine();
      System.out.println(mlm(s));
    }
  }
}