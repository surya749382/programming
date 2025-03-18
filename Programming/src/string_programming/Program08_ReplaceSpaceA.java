package string_programming;

import java.util.Scanner;

public class Program08_ReplaceSpaceA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		String newStr = str.replace(' ', '_');
		System.out.println(newStr);
	}


}
