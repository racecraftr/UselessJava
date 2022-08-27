package UselessJava.days.Day082;

import java.util.Scanner;

public class Day82 {
  static String squareString(String s){
    s = s.replaceAll("[ \\t]", "");
    String res = "";
    int root = (int)(Math.sqrt(s.length()));
    int x = 0;
    
    for(int i = 0; i < s.length(); i++) {
      res += s.charAt(i) + "\t";
      x++;
      if(x == root) {
        res += "\n";
        x = 0;
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter a string.");
      String s = sc.nextLine();
      System.out.println(squareString(s));
    }
  }
}