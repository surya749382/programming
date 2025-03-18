package string_programming;

import java.util.Scanner;

public class Program11_ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to reverse : " );
		String s1 = sc.next();
		String rev = "";
		
		for(int i=0; i < s1.length(); i++ ) {
			rev= s1.charAt(i) + rev;
		}
		
		System.out.println("Reverse of string is : "+ rev);
	}

}
