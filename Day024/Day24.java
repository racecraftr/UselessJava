package UselessJava.Day024;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Day24 {
    private boolean doesUserExist(String username, String website) throws IOException {
        URL url = new URL("https://www." + website + ".com/" + username);
        try {
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
    
            int code = connection.getResponseCode();
            return (code >= 200 && code < 400);
        }
        catch(IOException e){
            return false;
        }
    }
    
    public String doesUserExist(String username) throws IOException{
        boolean b = false;
        if(username.startsWith("u/")){
            b = doesUserExist(username, "reddit");
        }
        if(username.startsWith("tw@")){
            b = doesUserExist(username.replace("tw@", ""), "twitter");
        }
        if(username.startsWith("ig@")){
            b = doesUserExist(username.replace("ig@", "") + "/", "instagram");
        }
        if(username.startsWith("tt@")){
            b = doesUserExist(username.replace("tt", ""), "tiktok");
        }
        if(b) return "User exists";
        return "User does not exist";
    }
}

class Main{
    public static void main(String[] args) throws IOException {
        Day24 d = new Day24();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a username.");
            String s = sc.nextLine();
            System.out.println(d.doesUserExist(s) + "\n");
        }
    }
}
