package UselessJava.days.Day080;

import java.util.Scanner;

public class Day80 {
  
  static int doubleInvertNumber(int x) {
    boolean isNegative = x < 0;
    x = Math.abs(x);
    int temp = 0;
    while(x > 0){
      temp += 9 - (x % 10);
      x /= 10;
      temp *= 10;
    }
    temp /= 10;
    if(isNegative) temp *= -1;
    return temp;
  }
  
  static int doubleInvertNumber(String s){
    try {
      int x = Integer.parseInt(s);
      return doubleInvertNumber(x);
    } catch(Exception e){
      return 0;
    }
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter an integer");
      String s = sc.nextLine();
      System.out.println(doubleInvertNumber(s));
    }
  }
}