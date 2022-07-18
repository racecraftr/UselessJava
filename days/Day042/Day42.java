package UselessJava.days.Day042;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Day42 {
    @NotNull
    private long[][] generateTable(){
        int rows = (int)(Math.random() * 100);
        int cols = (int)(Math.random() * 100);
        long[][] table = new long[rows][cols];
    
        for(int i = 0; i < table.length; i++) {
            for(int j = 0; j < table[0].length; j++) {
                table[i][j] = (long)(Math.random() * Integer.MAX_VALUE);
                if((int)(Math.random() * 2) == 1) {
                    table[i][j] *= -1;
                }
            }
        }
        return table;
    }
    
    public String tableToString(){
        String res = "";
        long[][] table = generateTable();
        for(long[] longs : table) {
            for(long l : longs) {
                res += String.format("%16d", l);
            }
            res += "\n";
        }
        return res;
    }
    
    public static void main(String[] args) {
        Day42 d = new Day42();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Press enter/return");
            String s = sc.nextLine();
            System.out.println(d.tableToString());
        }
    }
}
