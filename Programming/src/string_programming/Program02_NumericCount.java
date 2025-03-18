package string_programming;

import java.util.Scanner;

public class Program02_NumericCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();

		char[] strArr = str.toCharArray();
		int count = 0;
		for (char x : strArr) {
			if (x >= '0' && x <= '9') {
				count++;
			}
			
		}
		System.out.println("Length of string is : " + count);
	}
}
