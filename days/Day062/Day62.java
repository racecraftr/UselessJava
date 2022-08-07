package UselessJava.days.Day062;

import java.util.Scanner;

public class Day62 {
    static String amogus(String s){
        char[] chars = s.toCharArray();
        String res = "";
        for (char c : chars) {
            int player = (int)c;
            res += "GUYS I CAN VOUCH THAT player IS " + player + "\n";
            res += "player CAN VOUCH GO AND TELL THEM COME ON\n";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string or else u are sus");
            String s = sc.nextLine();
            System.out.println(amogus(s));
        }
    }
}