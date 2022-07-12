package UselessJava.days.Day028;

import java.util.Scanner;

public class Day28 {
    private long convolutedAddition(long x, long y){
        while(y != 0){
            long temp = x & y;
            x = x ^ y;
            y = temp << 1;
            System.out.println("temp = x & y = " + temp);
            System.out.println("x = x ^ y = " + x);
            System.out.println("y = carry << 1 = " + y);
            System.out.println();
        }
        return x;
    }
    
    public long convolutedAddition(String s){
        s = s.replaceAll("[ \\t,]+", " ");
        String[] strings = s.split(" ");
        try{
            long l1 = Long.parseLong(strings[0]);
            long l2 = Long.parseLong(strings[1]);
            return convolutedAddition(l1, l2);
        } catch(Exception e){
            System.out.println("ERROR: NaN");
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Day28 d = new Day28();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter two numbers.");
            String s = sc.nextLine();
            System.out.println(d.convolutedAddition(s));
            System.out.println();
        }
    }
}
