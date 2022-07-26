package UselessJava.days.Day050;

import java.util.Scanner;

public class Day50{
    static String init = ">+++++[<+++++++++++++>-]<" + //0th array index set to 65 (A)
            ">" + // move to 1st array index
            ">++++++++[<++++++++++++>-]<+" + //1st array index set to 97 (a)
            ">" + //move to 2nd array index
            ">++++[<++++++++>-]<" + //2nd array index set to 32 ( )
            "<<\n"; //back to 0th array index
    
    static String brainString(String s){
        char[] chars = s.toCharArray();
        char[] currentChars = {'A', 'a', ' '};
        String res = "";
        res += init;
        for(char c : chars) {
            if(c >= 'a'){
                res += ">";
                
                int difference = c - currentChars[1];
                char aChar = difference > 0 ? '+' : '-';
                res += loop(aChar, Math.abs(difference));
                
                res += ".\n<";
                currentChars[1] = c;
                continue;
            }
            if(c >= 'A') {
                
                int difference = c - currentChars[0];
                char aChar = difference > 0 ? '+' : '-';
                res += loop(aChar, Math.abs(difference));
                
                res += ".\n";
                currentChars[0] = c;
                continue;
            }
            
            res += ">>";
    
            int difference = c - currentChars[2];
            char aChar = difference > 0 ? '+' : '-';
            res += loop(aChar, Math.abs(difference));
            
            currentChars[2] = c;
            res += ".\n<<";
        }
        res = res.replaceAll("(<>|><)", "");
        return res;
    }
    
    static String loop(char c, int times){
        if(times <= 0) return "";
        String res = "";
        for(int i = 0; i < times; i++) {
            res += c;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a string.");
            String s = sc.nextLine();
            System.out.println(brainString(s));
        }
    }
}