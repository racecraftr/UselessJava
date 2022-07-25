package UselessJava.days.Day049;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day49{
    private static final ArrayList<BoggleDice> BOGGLE_DIE = new ArrayList<>(Arrays.asList(
            new BoggleDice("aaafrs"),
            new BoggleDice("aaeeee"),
            new BoggleDice("aafirs"),
            new BoggleDice("adennn"),
            new BoggleDice("aeeeem"),
            new BoggleDice("aeegmu"),
            new BoggleDice("aegmnn"),
            new BoggleDice("afirsy"),
            new BoggleDice("bjkqxz"),
            new BoggleDice("ccenst"),
            new BoggleDice("ceiilt"),
            new BoggleDice("ceilpt"),
            new BoggleDice("ceipst"),
            new BoggleDice("ddhnot"),
            new BoggleDice("dhhlor"),
            new BoggleDice("dhlnor"),
            new BoggleDice("dhlnor"),
            new BoggleDice("eiiitt"),
            new BoggleDice("emottt"),
            new BoggleDice("ensssu"),
            new BoggleDice("fiprsy"),
            new BoggleDice("gorrvw"),
            new BoggleDice("iprrry"),
            new BoggleDice("nootuw"),
            new BoggleDice("ooottu")
                                                                                         ));
    
    
    public static String randomBoggle(){
        ArrayList<BoggleDice> boggleDice = new ArrayList<>(BOGGLE_DIE);
        String res = "";
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                int n = (int)(Math.random() * boggleDice.size());
                String option = boggleDice.get(n).getRandomOption();
                res += option + " ";
                boggleDice.remove(n);
            }
            res += "\n";
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Press enter to generate.");
            String s = sc.nextLine();
            System.out.println(randomBoggle());
        }
    }
}

class BoggleDice{
    char[] chars;
    
    public BoggleDice(String s){
        this.chars = s.toUpperCase().toCharArray();
    }
    
    public String getRandomOption(){
        char c = chars[(int)(Math.random() * chars.length)];
        if(c == 'Q') return "Qu";
        return " " + c;
    }
}