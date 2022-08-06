package UselessJava.days.Day061;

public class Day61 {
    static void instaCrash() {
        Thread t = new Thread() {
            public void run() {
                System.out.println("Fork Bomb lol");
            }
        };
        Thread t1 = t;
        t.start();
        t1.start();
        instaCrash();
    }

    public static void main(String[] args) {
        instaCrash();
    }
}