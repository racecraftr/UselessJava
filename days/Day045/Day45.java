package UselessJava.days.Day045;

import UselessJava.days.Day011.Day11;

public class Day45 {
    
    final Day11 d = new Day11();
    
    public void waitLonger() throws InterruptedException {
        int i = 1;
        while(true){
            String s = i + " ";
            if((int)(Math.random() * 10) == 1 && i >= 20){
                s += d.getRandomLine("days/Day045/insults.txt");
            }
            System.out.println(s);
            Thread.sleep(i * 100L);
            i++;
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Day45 d = new Day45();
        d.waitLonger();
    }
}
