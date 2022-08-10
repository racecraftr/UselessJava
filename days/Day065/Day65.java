package UselessJava.days.Day065;

public class Day65 {
    //write something useless. 
    static void wholeLotOfNothing() throws InterruptedException{
        for (int i = 0; i < 0; i++) {
            boolean b = false;
            while(b){
                System.out.println();
            }
        }
        boolean b = false;
        if(b){
            System.out.println();
        }
        Thread t = new Thread(() -> {
            for (int i = 0; i < 0; i++) {
                for (int index = 0; index < 0; index++) {
                    boolean bool = false;
                    while(bool){
                        System.out.println(bool);
                    }
                }
            }
        });
        t.start();
        t.join();
        int[] ints = new int[0];
        for (int i : ints) {
            boolean bool = false;
            do{
                System.out.println(i);
            } while (bool);
        }
        System.out.println();
        return;
    }

    public static void main(String[] args) throws InterruptedException{
        wholeLotOfNothing();
    }
}