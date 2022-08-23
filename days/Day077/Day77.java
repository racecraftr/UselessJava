package UselessJava.days.Day077;

import java.util.Scanner;

public class Day77 {
  static boolean isIpAddress(String s){
    String s1 = s.toUpperCase();
    s1 = s1.replaceAll("[ \\t]", "");
    if(s1.matches("((\\d{1,3})\\.){3}\\2")){
      String[] strings = s1.split("\\.");
      
      for(String string : strings) {
        try{
          int x = Integer.parseInt(string);
          if(x > 255) return false;
        }
        
        catch(Exception e){
          return false;
        }
      }
      return true;
    }
    
    else if(s1.matches("(([\\dA-F]{1,4}):){7}\\2")) {
      String[] strings = s1.split(":");
  
      for(String string : strings) {
        try {
          int x = Integer.parseInt(string, 16);
          if(x > 0xFFFF) return false;
        }
        
        catch(Exception e){
          return false;
        }
      }
      
      return true;
    }
    
    return false;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter an IP address that could exist. We're not doxxing anyone today. ");
      String s = isIpAddress(sc.nextLine()) ? "This is a valid IP address" : "This is not a valid IP address";
      System.out.println(s);
    }
  }
}