package UselessJava.Day008;

import java.util.Scanner;

public class Day8 {
   public String countStrokes(String s){
      //all characters found on a standard QWERTY keyboard are included.
      int strokes = 0, dots = 0, holes = 0;
      
      for(int i = 0; i < s.length(); i++) {
         String c = s.charAt(i) + "";
         /*
         count strokes. there are 4 different types of strokes:
         humps and bumps (u, n)
         doughnuts (0, O, o)
         straight lines (T, L, M, W)
         tails (J, j)
         
         each instance of these is a stroke.
         the strokes will be counted based on the common strokes used in the american-english print writing style.
         dots do not count as strokes, as the writing instrument is more or less stamped rather than moved in a line.
          */
         if(c.matches("[oOl689\\-_/\\\\|',UiSsJj;Cc?`~!()&]")) strokes += 1;
         
         if(c.matches("[237QqerTtyuIPpaDdfGghLXxVvbn=+{}<>@$^]")) strokes += 2;
         
         if(c.matches("[145WwERYIFHKZBNM\\[\\]*%]")) strokes += 3;
         
         if(c.matches("[#]")) strokes += 4;
         
         /*
         count holes. examples:
         9 - 1 hole
         0 - 1 hole
         8 - 2 holes
         88 - 4 holes
         p - 1 hole
         A - 1 hole
         a - 1 hole
         
         A hole is where a doughnut appears or where the open end of a hump/bump is closed by a stick or line.
         It can also be where three sticks and lines form a polygon.
          */
         if(c.matches("[690QqeROoPpAaDdgb]")) holes += 1;
         if(c.matches("[8B%&]")) holes += 2;
         
         /*
         count dots.
         i - 1 dot
         : - 2 dots
         ; - 1 dots (the comma counts as a stroke)
          */
         if(c.matches("[!ij;.?]")) dots += 1;
         if(c.matches("[:]")) dots += 2;
      }
      return "There are " + strokes + " strokes, " + holes + " holes, and " + dots + " dots.";
   }
}

class Main {
   public static void main(String[] args) {
      Day8 d = new Day8();
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter a string");
         String s = sc.nextLine();
         System.out.println(d.countStrokes(s));
         System.out.println();
      }
   }
}
