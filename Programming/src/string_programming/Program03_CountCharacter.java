package string_programming;

import java.util.Scanner;

public class Program03_CountCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();

		char[] strArr = str.toCharArray();
		int count = 0;
		for (char x : strArr) {
			if ((x!=' ')) {
				count++;
			}
			
		}
		System.out.println("Total characters in string is : " + count);
	}

}
