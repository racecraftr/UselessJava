package UselessJava.days.Day057;

import java.util.Scanner;

public class Day57 {
    
    static String faceString = "(⊙‿⊙)(⊙‿⊙)(⊙‿⊙)\t（〃・・〃）\t( ◉◞౪◟◉)\t( ಠ ಠ )\t(O∆O)\t༎ຶ‿༎ຶ\t(〠_〠)\t◎ܫ◎\t._.\t（Ω_Ω）";
    static String[] faces = faceString.split("\\t");
    
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.println("Would you like to have a staring contest? (y/n)");
            input = sc.nextLine();
            System.out.println();
            for(int i = 0; i < (int)(Math.random() * 20) + 5; i++) {
                System.out.println(faces[(int)(Math.random() * faces.length)]);
                Thread.sleep((long)(Math.random() * 2000) + 50);
            }
            System.out.println("\nOk, you win.");
        }
        while(! input.equalsIgnoreCase("n"));
        
    }
}