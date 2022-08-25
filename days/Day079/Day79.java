package UselessJava.days.Day079;

import java.util.Arrays;
import java.util.Scanner;

public class Day79 {
  static char[][] keys =
          {
                  "1234567890".toCharArray(),
                  "qwertyuiop".toCharArray(),
                  "asdfghjkl;".toCharArray(),
                  "zxcvbnmn,.".toCharArray()
          };
  
  static String navigation(String s){
    s = s.toLowerCase();
    String res = "";
    int row = 0, col = 0;
  
    for(int i = 0; i < s.length(); i++) {
      switch(s.charAt(i)){
        case 'w':{
          row --;
          row = Math.max(0, row);
          break;
        }
        case 'a':{
          col --;
          col = Math.max(0, col);
          break;
        }
        case 's':{
          row ++;
          row = Math.min(keys.length - 1, row);
          break;
        }
        case 'd':{
          col ++;
          col = Math.min(keys[row].length - 1, col);
          break;
        }
        case ' ':{
          res += " ";
          break;
        }
        case ':':{
          res += keys[row][col];
          break;
        }
        default: break;
      }
    }
    return res;
  }
  
  static void printKeys(){
    for(char[] key : keys) {
      System.out.println(Arrays.toString(key));
    }
    System.out.println("Use WASD to move up, right, down, left.\nUse [space] to type a space.\nUse : to output the current character.");
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      printKeys();
      System.out.println(navigation(sc.nextLine()));
    }
  }
}