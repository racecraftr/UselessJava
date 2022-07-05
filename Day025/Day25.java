package UselessJava.Day025;

import java.util.Scanner;

public class Day25 {
    public String generateRandomCoordinate(){
        char[] lat = new char[]{'N', 'S'};
        char[] lon = new char[]{'E', 'W'};
        double latitude = Math.random() * 90;
        double longitude = Math.random() * 180;
        
        String latString =  toDMS(latitude) + lat[(int)(Math.random() * 2)];
        String longString = toDMS(longitude) + lon[(int)(Math.random() * 2)];
        return latString + " " + longString;
    }
    
    private String toDMS(double decimal){
        double d = decimal;
        long l1 = (long) d;
        d -= l1;
        d *= 60;
        long l2 = (long)d;
        d -= l2;
        d *= 60;
        long l3 = (long)d;
        return l1 + "º " + l2 + "' " + l3 + "\"";
    }
}

class Main{
    public static void main(String[] args) {
        Day25 d = new Day25();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("press enter to generate a random coordinate!");
            String s = sc.nextLine();
            System.out.println(d.generateRandomCoordinate());
        }
    }
}
