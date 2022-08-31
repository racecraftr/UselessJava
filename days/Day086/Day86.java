package UselessJava.days.Day086;

import java.util.Random;
import java.util.Scanner;

public class Day86 {

  static Random random = new Random();
  
  static String addMult(double d){
   //define two numbers that add up to d.
   float x = random.nextFloat();
   double y = d - x;
   double product = x * y;

   return "x + y = " + d + "\nxy = " + product;
 }

 static String addMult(String s){
   try{
     double x = Double.parseDouble(s);
     return addMult(x);
   }
   catch (Exception e) {
    return null; 
   }
 }

 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   while (true) {
     System.out.println("Enter a number.");
     String s = sc.nextLine();
     System.out.println(addMult(s));
   }
 }
}
