package UselessJava.days.Day069;

public class Day69 {
    static final long NICE = 69L;
    //nice
    static void nice() throws InterruptedException {
        boolean nice = true;
        while(nice){
            System.out.println("nice");
            Thread.sleep(NICE + (long)(Math.random() * NICE));
            if(Math.random() < 0.00069){
                nice = false;
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        nice();
    }
}