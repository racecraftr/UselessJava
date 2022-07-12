package UselessJava.days.Day002;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Day2 {
   public boolean doesUrlExist(String url){
      try{
         URL u = new java.net.URL(url);
         URLConnection uc = u.openConnection();
         uc.connect();
         return true;
      }catch(Exception e){
         return false;
      }
   }
   
   public int getUrlStatusCode(String url){
      try{
         URL u = new URL(url);
         HttpURLConnection http = (HttpURLConnection)u.openConnection();
         return http.getResponseCode();
      }catch(Exception e){
         return -1;
      }
   }
   
   public void printUrlStatusCode(String url){
      int statusCode = getUrlStatusCode(reformatURL(url));
      if(statusCode == -1){
         System.out.println("Error: " + url + " does not exist");
      }else{
         System.out.println("Status code: " + statusCode + " (" + getHttpResponseType(statusCode) + ")");
      }
   }
   
   private String reformatURL(String url){
      
      if(url.startsWith("https://")){
         if(url.startsWith("https://www.")){
            return url;
         }
         return url.replace("https://", "http://www.");
      } else if (url.startsWith("http://")){
         if(url.startsWith("http://www.")){
            return url;
         }
         return url.replace("http://", "http://www.");
      } else if (url.startsWith("www.")){
         return "https://" + url;
      } else {
         return "https://www." + url;
      }
   }
   
   private String getHttpResponseType(int response){
      switch(response){
         case 200:
            return "OK";
         case 301:
            return "Moved Permanently";
         case 302:
            return "Found";
         case 304:
            return "Not Modified";
         case 400:
            return "Bad Request";
         case 401:
            return "Unauthorized";
         case 403:
            return "Forbidden";
         case 404:
            return "Not Found";
         case 500:
            return "Internal Server Error";
         case 501:
            return "Not Implemented";
         case 502:
            return "Bad Gateway";
         case 503:
            return "Service Unavailable";
         case 504:
            return "Gateway Timeout";
         default:
            return "Unknown";
      }
   }
}

class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(true){
         System.out.println("Enter a URL: ");
         String url = sc.nextLine();
         Day2 d = new Day2();
         d.printUrlStatusCode(url);
         System.out.println();
      }
   }
}
