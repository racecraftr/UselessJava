package UselessJava.days.Day053;

public class Day53 {
    
    static final char[] consonants = "wrtypsdfghjklzcvbnm".toCharArray();
    static final char[] vowels = "aeiou".toCharArray();
    static String makeWord(){
        
        String res = "";
        for(int i = 0; i < (int)(Math.random() * 10) + 1; i++) {
            res += getRandomChar(consonants);
            res += getRandomChar(vowels);
            res += getRandomChar(consonants);
        }
        return res;
    }
    
    static char getRandomChar(char[] chars){
        char c = chars[((int)(Math.random() * chars.length))];
        return c;
    }
    
    public static void main(String[] args) throws InterruptedException {
        while(true){
            System.out.println(makeWord());
            Thread.sleep(1000);
        }
    }
}