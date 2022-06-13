package UselessJava.Day7;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Day7 {
   
   public String averageColor(String imageFile) throws IOException {
      File file = new File(imageFile).getAbsoluteFile();
      BufferedImage img = ImageIO.read(file);
      
      long r = 0, g = 0, b = 0;
      int size = img.getHeight() * img.getWidth();
      
      for(int i = 0; i < img.getHeight(); i++) {
         for(int j = 0; j < img.getWidth(); j++) {
            Color color = new Color(img.getRGB(j, i), true);
            r += color.getRed();
            g += color.getGreen();
            b += color.getBlue();
         }
      }
      
      r /= size;
      g /= size;
      b /= size;
      return "file: " + imageFile + " \nAverage color: (" + r + ", " + g + ", " + b + ")";
   }
}

class Main{
   
   static String root = "/Users/avi/code/personalStuff/src/UselessJava/Day7/testImages/";
   static String[] files = new String[]{"test-1.jpeg"};
   
   public static void main(String[] args) throws IOException {
      Day7 day7 = new Day7();System.out.println(day7.averageColor(root + files[0]));
   }
}
