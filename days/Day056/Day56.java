package UselessJava.days.Day056;


import java.util.Scanner;

public class Day56 {
    static String snakeTalk(String s){
        String res = s;
        res = res.replaceAll("s+", loop());
        res = res.replaceAll("x+", "k" + loop());
        res = res.replaceAll("[ \\t]", "_");
        return res;
    }
    
    private static String loop(){
        String res = "";
        for(int i = 0; i < (int)(Math.random() * 15) + 5; i++) {
            res += 's';
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string.");
            String s = sc.nextLine();
            System.out.println(snakeTalk(s));
        }
    }
}