package string_programming;

import java.util.Scanner;

public class Program03_isPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to reverse : " );
		String s1 = sc.next();
		String rev = "";
		
		for(int i=0; i < s1.length(); i++ ) {
			rev= s1.charAt(i) + rev;
		}
		if(s1.equals(rev))
		System.out.println("Palindrome");
		else {
			System.out.println("Not Palindrome !!");
		}
	}

}
