package UselessJava.Day6;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Day6 {
   
   final HashMap<Character, ArrayList<String>> dictionary = new HashMap<>();
   
   public Day6(String dictionaryFile){
      File file = new File(dictionaryFile);
      for(int i = 0; i < 26; i++) {
         dictionary.put((char)(i + 'A'), new ArrayList<>());
      }
      //read a text file and put each word into the dictionary
      try {
         Scanner sc = new Scanner(file);
         while(sc.hasNext()) {
            String s = sc.next();
            char c = s.charAt(0);
            if(dictionary.containsKey(c)) dictionary.get(c).add(s);
         }
      } catch (Exception e) {
         System.out.println("Error: " + e.getMessage());
      }
   }
   
   public String createAcronym(String s){
      char[] chars = s.toUpperCase(Locale.ROOT).toCharArray();
      String res = "";
      for(char c : chars) {
         if(dictionary.containsKey(c)) {
            ArrayList<String> strings = dictionary.get(c);
            res += strings.get((int) (Math.random() * strings.size())) + " ";
         }
         else res += c;
      }
      return res;
   }
}

class Main{
   
   /*
   Dictionary file (allWordsInDictionary.txt) from https://github.com/dwyl/english-words.
   This contains over 450,000 words, so there may be some strange words you may not recognize.
    */
   
   static String dictionaryFile = "./Day6/allWordsInDictionary.txt";
   
   public static void main(String[] args) {
      Day6 d = new Day6(dictionaryFile);
      Scanner sc = new Scanner(System.in);
      while (true){
         System.out.println("Enter a word.");
         String s = sc.nextLine();
         System.out.println(d.createAcronym(s));
         System.out.println();
      }
   }
}
