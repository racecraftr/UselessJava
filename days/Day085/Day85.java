package UselessJava.days.Day085;

import java.util.Scanner;

public class Day85 {
  static boolean isSus(String s){
    String regex = "when the .* is sus.*";
    s = s.trim();
    s = s.toLowerCase();
    s = s.replaceAll("[ \\t]+", " ");
    return s.matches(regex);
  }

  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("Enter a string and I will see if it is sus.");
      String s = sc.nextLine();
      if (isSus(s)){
        System.out.println("This string is sus, beware of impostors");
      }
      else{
        System.out.println("This string is not sus, you can complete your tasks freely");
      }
    }
  }
}
