package UselessJava.days.Day060;

public class Day60 {
    static String gibberish(){
        String res = "";
        for(int i = 0; i < (int)(Math.random() * 10) + 10; i++) {
            for(int j = 0; j < (int)(Math.random() * 20) + 1; j++) {
                res += (char)((int)(Math.random() * 27) + 'a');
            }
            res += " ";
        }
        return res + ".";
    }
    
    public static void main(String[] args) throws InterruptedException {
        while(true){
            System.out.println(gibberish());
            Thread.sleep(2000);
        }
    }
}