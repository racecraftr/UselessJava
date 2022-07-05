package UselessJava.Day029;

import java.util.Scanner;

public class Day29 {
    public String flip(String s){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!?&\\/";
        String flipped = "∀qƆpƎℲפHIſʞ˥WNOԀQɹS┴∩ΛMX⅄Zɐqɔpǝɟƃɥᴉɾʞlɯuodbɹsʇnʌʍxʎz0ƖᄅƐㄣϛ9ㄥ86¡¿⅋/\\";
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(chars.indexOf(c) > -1){
                res += flipped.charAt(chars.indexOf(c));
            }
            else res += c;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Day29 d = new Day29();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a string");
            String s = sc.nextLine();
            System.out.println(d.flip(s) + "\n");
        }
    }
}
