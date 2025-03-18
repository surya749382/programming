package string_programming;

import java.util.Scanner;

public class Program05_VovelCharacterCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();

		char[] strArr = str.toCharArray();
		int vovelCount = 0;
		
				
		for (char x : strArr) {
			if(x == 'a' ||x == 'e' ||x == 'i' ||x == 'o' ||x == 'u' || x == 'A' ||x == 'E' ||x == 'I' ||x == 'O' ||x == 'U' )	{
				vovelCount++;
			}
		}
		System.out.println("Total numbers of vovel is : " + vovelCount);
		
	}
}
