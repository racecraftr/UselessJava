package UselessJava.days.Day031;

import UselessJava.days.Day003.Day3;

import java.util.Hashtable;
import java.util.Scanner;

public class Day31 {
    
    final Day3 determiner = new Day3(); // meta-uselessness
    
    final Hashtable<String, Integer> typeTable = new Hashtable<>();
    
    public Day31(){
        typeTable.put("boolean", 0);
        typeTable.put("byte", 0);
        typeTable.put("short", 0);
        typeTable.put("int", 0);
        typeTable.put("long", 0);
        typeTable.put("float", 0);
        typeTable.put("double", 0);
        typeTable.put("unsigned_byte", 0);
        typeTable.put("unsigned_short", 0);
        typeTable.put("unsigned_int", 0);
        typeTable.put("unsigned_long", 0);
        typeTable.put("unsigned_float", 0);
        typeTable.put("unsigned_double", 0);
        typeTable.put("char", 0);
        typeTable.put("String", 0);
    }
    
    public String arrayType(String s){
        String finalType = null;
        s = s.trim();
        s = s.replaceAll(",[ \\t]+", ",");
        s = s.replaceAll("(^\\[|^\\(|\\]$|\\)$)", "");
        boolean hasSigned = false;
        String[] strings = s.split(",");
        for(String str : strings) {
            String type = determiner.determineType(str);
            typeTable.put(type, typeTable.get(type) + 1);
            if(!type.startsWith("unsigned_") && !type.equals("char") && !type.equals("boolean")) hasSigned = true;
            if(type.equals("String")) return "String";
        }
        if(!hasSigned){
            if(typeTable.get("boolean") > 0){finalType = "boolean";}
            if(typeTable.get("unsigned_byte") > 0){finalType = "unsigned_byte";}
            if(typeTable.get("unsigned_short") > 0){finalType = "unsigned_short";}
            if(typeTable.get("unsigned_int") > 0){finalType = "unsigned_int";}
            if(typeTable.get("char") > 0){finalType = "char";}
            if(typeTable.get("unsigned_long") > 0){finalType = "unsigned_long";}
            if(typeTable.get("unsigned_float") > 0){finalType = "unsigned_float";}
            if(typeTable.get("unsigned_double") > 0){finalType = "unsigned_double";}
            return finalType;
        }
        if(typeTable.get("byte") > 0 || typeTable.get("unsigned_byte") > 0){finalType = "byte";}
        if(typeTable.get("short") > 0 || typeTable.get("unsigned_short") > 0){finalType = "short";}
        if(typeTable.get("int") > 0 || typeTable.get("unsigned_int") > 0 || typeTable.get("char") > 0){finalType = "int";}
        if(typeTable.get("long") > 0 || typeTable.get("unsigned_long") > 0){finalType = "long";}
        if(typeTable.get("float") > 0 || typeTable.get("unsigned_float") > 0){finalType = "float";}
        if(typeTable.get("double") > 0 || typeTable.get("unsigned_double") > 0){finalType = "double";}
        return finalType;
    }
    
    public static void main(String[] args) {
        Day31 d = new Day31();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter an array");
            String s = sc.nextLine();
            System.out.println(d.arrayType(s) + "\n");
        }
    }
}
