package UselessJava.days.Day039;

import java.time.Instant;

public class Day39 {
    public String videoGameDaysSince(){
        long unixTime = Instant.now().getEpochSecond();
        long[] videogameDays  = {
                unixTime/(20 * 60), //minecraft
                unixTime/(60 * 60 * 24), //animal crossing
                unixTime/(60 * 60 * 12), //pokemon sun and moon
                unixTime/(60 * 8), //don't starve
                
        };
        String res = "Since Jan 1, 1970, it has been:\n";
        
        res += videogameDays[0] + " Minecraft Days\n";
        res += videogameDays[1] + " Animal Crossing Days\n";
        res += videogameDays[2] + " Pokemon: sun & moon Days\n";
        res += videogameDays[3] + " Don't starve Days\n";
        
        return res;
    }
    
    public static void main(String[] args) throws InterruptedException {
        Day39 d = new Day39();
        while(true){
            System.out.println(d.videoGameDaysSince());
            Thread.sleep(1000 * 60);
        }
    }
}
