package UselessJava.days.Day067;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Day67 {
    static String weirdDate(){
        Date date = new Date();
        String format = "MMMM-yyyy-dd a->ss->mm->hh";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) throws InterruptedException{
        while(true){
            System.out.println(weirdDate());
            Thread.sleep(1000L * 60L);
        }
    }
}