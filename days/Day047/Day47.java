package UselessJava.days.Day047;

public class Day47 {
    public static void matrixFlow() throws InterruptedException {
        
        int rows = (int)(Math.random() * 500);
        int cols = 10;
        
        for(int i = 0; i < rows; i++) {
            StringBuilder s = new StringBuilder();
            for(int j = 0; j < cols; j++) {
                int x = (int)(Math.random() * 100000);
                s.append(String.format("%05d", x));
                s.append(" ");
            }
            System.out.println(s);
            Thread.sleep(90);
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        matrixFlow();
    }
}
