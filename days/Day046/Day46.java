package UselessJava.days.Day046;

import java.util.Scanner;

@SuppressWarnings("BusyWait")
public class Day46 {
    public void wordScroll(String s) throws InterruptedException {
        int window = Math.max(5, s.length()/2);
        int start = -1 * window, end = 0;
        while(start <= s.length()){
            String shown = s.substring(
                    Math.max(0, start),
                    Math.min(end, s.length())
                                      );
            if(start < 0){
                for(int i = 0; i < Math.abs(start); i++) {
                    shown = " " + shown;
                }
            }
            System.out.println(shown);
            start ++;
            end ++;
            Thread.sleep(300L);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Day46 d = new Day46();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string.");
            String s = sc.nextLine();
            d.wordScroll(s);
        }
    }
}
