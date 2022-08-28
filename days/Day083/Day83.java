package UselessJava.days.Day083;

import java.util.Scanner;

public class Day83 {
	static String triangleString (String s){
		s = s.replaceAll("\\t", "");
		char[] chars = s.toCharArray();
		int x = 0;
		int max = 1;
		String res = "";
		for(char c : chars){
			res += c + "\t";
			x ++;
			if(x == max){
				res += "\n";
				x = 0;
				max ++;
			}
		}
		return res;
	}

	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a string.");
			String s = sc.nextLine();
			System.out.println(triangleString(s));
		}
	}
}
