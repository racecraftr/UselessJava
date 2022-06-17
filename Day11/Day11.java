package UselessJava.Day11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Day11 {
   
   final private String root = "/Users/avi/code/personalStuff/src/UselessJava/Day11/wordLists/";
   
   public String madLibs(String s, int num) throws IOException {
      String[] words = s.split("[ \\t\\n]");
      String res = "";
      for(int i = 0; i < Math.max(num, 1); i++) {
         for(String word : words) {
            word = word.replaceAll("(<noun>|<n>)", getRandomLine(root + "nounList.txt"));
            word = word.replaceAll("(<adverb>|<adv>)", getRandomLine(root + "adverbList.txt"));
            word = word.replaceAll("(<adjective>|<adj>)", getRandomLine(root + "adjectiveList.txt"));
            word = word.replaceAll("(<plural noun>|<pnoun>|<pn>)", pluralizeNoun(getRandomLine(root + "nounList.txt")));
            
            word = word.replaceAll("(<singular verb>|<sverb>|<sv>)",singularVerb(getRandomLine(root + "verbList.txt")));
            word = word.replaceAll("(<plural verb>|<pverb>|<pv>|<verb>|<v>)", (getRandomLine(root + "verbList.txt")));
            word = word.replaceAll("(<present verb>|<psv>)", presentTense(getRandomLine(root + "verbList.txt")));
            word = word.replaceAll("(<past tense verb>|<ptv>)", pastTense(getRandomLine(root + "verbList.txt")));
            
            res += word + " ";
         }
         res += "\n";
      }
      return res;
   }
   
   public String madLibs(String s) throws IOException {
      if(s.matches("(.+\\t\\[\\d+])")) {
         String[] strings = s.split("\\t");
         String numString = strings[1].substring(1, strings[1].length() - 1);
         int num = Integer.parseInt(numString);
         return madLibs(strings[0], num);
      }
      return madLibs(s, 1);
   }
   
   private String getRandomLine(String path){
      List<String> lines;
      try{
         lines = Files.readAllLines(Paths.get(path));
      }
      catch(IOException e) {
         e.printStackTrace();
         return "[ERROR]";
      }
      
      return lines.get((int)(Math.random() * lines.size()));
   }
   
   private String pluralizeNoun(String noun){
      //return the plural of the noun
      if(noun.equals("goose")) return "geese";
      if(noun.endsWith("ey")) return noun + "s";
      if(noun.endsWith("y")) return noun.substring(0, noun.length() - 1) + "ies";
      if(noun.endsWith("s")) return noun + "es";
      return noun + "s";
   }
   
   private String pastTense(String verb) {
      //return the past tense of the verb
      if(verb.endsWith("ed")) return verb;
      if(verb.equals("be")) return "was";
      if(verb.equals("have")) return "had";
      if(verb.equals("do")) return "did";
      if(verb.equals("can")) return "could";
      if(verb.endsWith("e")) return verb + "d";
      return verb + "ed";
   }
   
   private String presentTense(String verb) {
      //return the present tense of the verb
      if(verb.endsWith("ed")) return verb.substring(0, verb.length() - 2) + "ing";
      if(verb.equals("be")) return "is";
      if(verb.equals("have")) return "has";
      if(verb.equals("do")) return "does";
      if(verb.endsWith("e")) return verb.substring(0, verb.length() - 1)+ "ing";
      return verb + "ing";
   }
   
   private String singularVerb(String verb) {
      if(verb.endsWith("sh")) return verb + "es";
      if(verb.endsWith("ch")) return verb + "es";
      if(verb.equals("be")) return "are";
      return verb + "s";
   }
}

class Main{
   public static void main(String[] args) throws IOException {
      Day11 d = new Day11();
      Scanner sc = new Scanner(System.in);
      while (true){
         System.out.println("Enter a string bud. Do it. You won't.");
         String s = sc.nextLine();
         System.out.println(d.madLibs(s));
      }
   }
}
