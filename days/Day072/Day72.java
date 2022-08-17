package UselessJava.days.Day072;

import java.util.Scanner;

public class Day72 {
  static void delete(String s) throws InterruptedException {
    System.out.print(s);
    Thread.sleep(200);
    for(int i = 0; i < s.length(); i++) {
      System.out.print("\b");
      Thread.sleep(200);
    }
  }
  
  public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter a string. ");
      String s = sc.nextLine();
      delete(s);
    }
  }
}