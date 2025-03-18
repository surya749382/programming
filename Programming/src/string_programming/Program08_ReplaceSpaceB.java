package string_programming;

import java.util.Scanner;

public class Program08_ReplaceSpaceB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println(replaceSpace(str));
		
	}

	public static String replaceSpace(String str) {

		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) ==' ')
			newStr = newStr+"_";
			else
				newStr = newStr+str.charAt(i);
		}

		return newStr;

	}
}
