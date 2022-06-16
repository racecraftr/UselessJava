package UselessJava.Day9;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Day9 {
   public String multiHash(String s, int times) throws NoSuchAlgorithmException{
      System.out.println("iterations: 0, result: " + s);
      if(times <= 0) return s;
      String res = s;
      for(int i = 1; i <= times; i++) {
         //covert a string into a sha-256 hash
          try {
              MessageDigest md = MessageDigest.getInstance("SHA-256");
              md.update(res.getBytes());
              byte[] digest = md.digest();
              StringBuffer sb = new StringBuffer();
              for(byte b : digest) {
                  sb.append(String.format("%02x", b & 0xff));
              }
              res = sb.toString();
             System.out.println("iterations: " + i + ", result: "+ res);
             Thread.sleep(350);
          } catch (Exception e) {
              e.printStackTrace();
          }
      }
      return res;
   }
   
   public String multiHash(String s) throws NoSuchAlgorithmException {
      if(s.matches("([^ ]+ -*\\d+)")){
         String[] things = s.split(" ");
         String s1 = things[0].replaceAll("_", " ");
         int times = Integer.parseInt(things[1]);
         return multiHash(s1, times);
      }
      return multiHash(s, 1);
   }
}

class Main {
   public static void main(String[] args) throws NoSuchAlgorithmException {
      Day9 d = new Day9();
      Scanner sc = new Scanner(System.in);
      while (true){
         System.out.println("Enter a string or else");
         String s = sc.nextLine();
         System.out.println(d.multiHash(s));
         System.out.println();
      }
   }
}
