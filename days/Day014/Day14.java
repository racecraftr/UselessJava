package UselessJava.days.Day014;

import java.util.Scanner;

public class Day14 {
   public String sortString(String s){
      char[] chars = s.toCharArray();
      quickSort(chars);
      return String.valueOf(chars);
   }
   
   private void quickSort(char[] chars){
      quickSort(chars, 0, chars.length - 1, 0);
   }
   
   private void quickSort(char[] chars, int start, int end, int iterations){
      System.out.println("iterations: "+ iterations + "\tresult: " + String.valueOf(chars));
      if(start >= end) return;
      int pivot = chars[(start + end) / 2];
      int i = start, j = end;
      while(i <= j){
         while(chars[i] < pivot) i++;
         while(chars[j] > pivot) j--;
         if(i <= j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
         }
      }
      quickSort(chars, start, j, iterations + 1);
      quickSort(chars, i, end, iterations + 1);
   }
}

class Main{
    public static void main(String[] args) {
        Day14 d = new Day14();
        Scanner sc = new Scanner(System.in);
        while(true){
          System.out.println("Enter a string bud. Do it. You won't.");
          String s = sc.nextLine();
          System.out.println(d.sortString(s) + "\n");
        }
    }
}
