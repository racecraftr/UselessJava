package UselessJava.days.Day066;

public class Day66 {

    static char[] chars = "qwertyuiopasdfghjklzxcvbnm,. \n".toCharArray();
    static void monkeys() throws InterruptedException {
        //if a monkey were to randomly type keys on a keyboard, it would eventually write every written work known to man. 
        while(true){
            System.out.print(chars[(int)(Math.random() * chars.length)]);
            Thread.sleep(50 + (long)(Math.random() * 100));
        }
    }

    public static void main(String[] args) throws InterruptedException {
        monkeys();
    }
}