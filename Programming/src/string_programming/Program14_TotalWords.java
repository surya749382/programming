
package string_programming;

import java.util.Scanner;

public class Program14_TotalWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();
		System.out.println(getWordCount(str));
	}
	public static int getWordCount(String str) {
		
		char[] s = str.toCharArray();
		int wordCount = 0;
		
		for(int i = 0; i < s.length; i++) {
			if(s[i]== ' '&& i-1 !=-1 && s[i-1] != ' ' ) {
				wordCount++;
			}
			if(i == s.length-1 && s[i] != ' ') {
				wordCount++;
			}
			
		}
		
		
		
		return wordCount;
	}
}
