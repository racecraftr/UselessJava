package UselessJava.days.Day038;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Day38 {
    final String root = "days/Day038/images/";
    
    final String[] files = {"0.jpg"};
    
    String [] shades = {
            "▓▒░",
            "@%#*+=-:. ",
            "$@B%8&WM#*oahkbdpqwmZO0QLCJUYXzcvunxrjft/\\|()1{}[]?-_+~i!lI;:,\"^`.",
    };
    
    public String imageToString(String imageFile) throws IOException {
        
        int resolution = 10;
        int detail = 1;
    
        char[] chars = shades[detail].toCharArray();
        if(resolution < 1) resolution = 1; //can never be too sure :/
        
        File file = new File(imageFile);
        BufferedImage img = ImageIO.read(file);
        String res = "";
        for(int i = 0; i < img.getHeight(); i+=resolution) {
            for(int j = 0; j < img.getWidth(); j+=resolution) {
                int p = img.getRGB(j, i);
                Color color = new Color(p, true);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();
                
                int s = (int)(.3 * r + .59 * g + .11 * b);
                int index = (int)(s/255.0 * chars.length);
                //System.out.println(s + "-> " + index);
                res += chars[index];
            }
            res += "\n";
        }
        return  res;
    }
    
    public static void main(String[] args) throws IOException {
        Day38 d = new Day38();
        System.out.println(d.imageToString(d.root + d.files[0]));
    }
}
