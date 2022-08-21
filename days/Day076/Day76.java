package UselessJava.days.Day076;


import java.util.HashMap;
import java.util.Scanner;

public class Day76 {
  static HashMap<Character, String> keyMap = new HashMap<>(){{
    put('A', "2");
    put('B', "22");
    put('C', "222");
    put('D', "3");
    put('E', "33");
    put('F', "333");
    put('G', "4");
    put('H', "44");
    put('I', "444");
    put('J', "5");
    put('K', "55");
    put('L', "555");
    put('M', "6");
    put('N', "66");
    put('O', "6666");
    put('P', "7");
    put('Q', "77");
    put('R', "777");
    put('S', "7777");
    put('T', "8");
    put('U', "88");
    put('V', "888");
    put('W', "9");
    put('X', "99");
    put('Y', "999");
    put('Z', "9999");
    put(' ', "*");
    put('_', "1");
    put(',', "11");
    put('@', "111");
  }};
  
  static String toKeypad(String s){
    char[] chars = s.toUpperCase().toCharArray();
    String res = "";
    int i = 0;
    
    for(char c : chars) {
      if(keyMap.containsKey(c)){
        res += keyMap.get(c) + " ";
      }
      i++;
      if(i > 9){
        res += "\n";
      }
    }
    return res;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter a string.");
      String s = sc.nextLine();
      System.out.println(toKeypad(s));
    }
  }
}