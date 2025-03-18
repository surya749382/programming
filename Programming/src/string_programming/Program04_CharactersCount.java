package string_programming;

import java.util.Scanner;

public class Program04_CharactersCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();

		char[] strArr = str.toCharArray();
		int spaceCharacterCount = 0;
		int upperCaseCharacterCount = 0;
		int lowerCaseCharacterCount = 0;
		int numericCharacterCount = 0;
		int specialCharacterCount = 0;
				
		for (char x : strArr) {
			if ((x==' ')) {
				spaceCharacterCount++;
			}else if(x >= '0' && x <= '9') {
				numericCharacterCount++;
			}else if(x >= 'a' && x <= 'z') {
				lowerCaseCharacterCount++;
			}else if(x >= 'A' && x <= 'Z') {
				upperCaseCharacterCount++;
			}else  {
				specialCharacterCount++;
			}
			
		}
		System.out.println("Total space characters in string is : " + spaceCharacterCount);
		System.out.println("Total numeric characters in string is : " + numericCharacterCount);
		System.out.println("Total lower case characters in string is : " + lowerCaseCharacterCount);
		System.out.println("Total upper case characters in string is : " + upperCaseCharacterCount);
		System.out.println("Total special case characters in string is : " + spaceCharacterCount);
	}
}
