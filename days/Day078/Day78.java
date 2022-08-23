package UselessJava.days.Day078;

import java.util.Scanner;

public class Day78 {
  
  static char[][] keys =
          {
                  "1234567890".toCharArray(),
                  "qwertyuiop".toCharArray(),
                  "asdfghjkl;".toCharArray(),
                  "zxcvbnmn,./".toCharArray()
          };
  static void badTyping(String s) throws InterruptedException {
    for(int i = 0; i < s.length(); i++) {
      if(Math.random() < 1.0 / 4) {
        for(int x = 0; x < Math.random() * 2; x++) {
          printRandomChar(s, i);
        }
      }
      System.out.print(s.charAt(i));
      Thread.sleep(200 + (long) (Math.random() * 100));
    }
  }
  
  private static void printRandomChar(String s, int i) throws InterruptedException {
    char wrongChar = keys[(int) (Math.random() * keys.length)][(int) (Math.random() * keys[0].length)];
    boolean charFound = false;
    for(int row = 0; row < keys.length; row++) {
      for(int col = 0; col < keys[row].length; col++) {
        if(keys[row][col] == s.charAt(i)) {

          int x = (int) (Math.random() * 4);
          switch(x) {
            case 0: {
              wrongChar = keys[row][Math.max(0, col - 1)];
              break;
            }
            case 1: {
              wrongChar = keys[row][Math.min(keys[row].length - 1, col + 1)];
              break;
            }
            case 2: {
              wrongChar = keys[Math.max(0, row - 1)][col];
              break;
            }
            case 3: {
              wrongChar = keys[Math.min(keys.length - 1, row + 1)][col];
            }
          }
          charFound = true;
          break;
        }
      }
      if(charFound) {
        break;
      }
    }
    
    System.out.print(wrongChar);
    Thread.sleep(200 + (long) (Math.random() * 100));
    System.out.print("\b");
    Thread.sleep(200 + (long) (Math.random() * 100));
  }
  
  public static void main(String[] args) throws InterruptedException {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter a string.");
      badTyping(sc.nextLine());
      System.out.println();
    }
  }
}