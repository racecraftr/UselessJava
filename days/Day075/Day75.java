package UselessJava.days.Day075;
import java.util.Scanner;

public class Day75 {
  static String sizeOfString(String s){
    byte[] bytes = s.getBytes();
    int length = bytes.length;
    String res = length + " B";
    if(length < 1000){
      return res;
    }
    
    double d = length * 1.0;
    int magnitude = 0;
    while(d >= 1000 && magnitude <= 3){
      magnitude ++;
      d /= 1000.0;
    }
    
    String magString = "B";
    switch(magnitude) {
      case 1 -> magString = "KB";
      case 2 -> magString = "MB";
      case 3 -> magString = "GB";
    }
    
    return String.format("%.2f", d) + " " + magString;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter a string.");
      String s = sc.nextLine();
      System.out.println(sizeOfString(s));
    }
  }
}