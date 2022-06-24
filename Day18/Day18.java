package UselessJava.Day18;

public class Day18 {
   public String detectCosmicRay(){
      final String[] comments = {"Why are you still here?",
                                "Most systems automatically fix errors caused by cosmic rays.",
                                "This is so stupid.",
                                "Based off of a reddit post by u/TripplerX.",
                                "I did nawt kill her, I did naaawt! Oh hai Mark.",
                                "The cheese stands alone, so sad :(",
                                "???",
                                 "Why are we still here... just to suffer..."};
      Thread t = new Thread(() -> {
         System.out.println(comments[(int) (Math.random() * comments.length)]);
         while(true) {
            try {
               Thread.sleep(200);
            }
            catch(InterruptedException e) {
               throw new RuntimeException(e);
            }
         }
      }
      );
      t.start();
      boolean b = true;
      while (b){
      }
      t.interrupt();
      return "Cosmic ray detected";
   }
}

class Main{
   public static void main(String[] args) {
      Day18 d = new Day18();
      System.out.println(d.detectCosmicRay());
   }
}
