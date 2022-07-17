package UselessJava.days.Day040;

import java.util.Scanner;

public class Day40 {
    public void count() throws InterruptedException {
        while(true){
            int max = 10;
            if((int)(Math.random() * 100) == 1){
                max = 11;
            }
            for(int i = 0; i < max; i++) {
                System.out.println(i + 1);
                Thread.sleep(500);
            }
            System.out.println("Starting over...\n");
            Thread.sleep(500);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Day40 d = new Day40();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        d.count();
    }
}
