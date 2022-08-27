package UselessJava.days.Day081;

public class Day81 {
  static void roulette() throws InterruptedException {
    int streak = 0;
    //crashes the program with a 1/6 chance for it to happen.
    while(true){
      System.out.println("Spinning...");
      System.out.print("[");
      for(int i = 0; i < 10; i++) {
        System.out.print("=");
        Thread.sleep(200);
      }
      System.out.println("]");
      int x = (int)(Math.random() * 6);
      if(x == 0) {
        break;
      }
      System.out.println("Safe for now.");
      streak ++;
      Thread.sleep(200);
    }
    try{System.out.println(Integer.parseInt(""));}
    catch(Exception e){
      e.printStackTrace();
      System.out.println("You got a streak of " + streak + ".");
    }
  }
  
  public static void main(String[] args) throws InterruptedException {
    roulette();
  }
}