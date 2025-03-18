package string_programming;

import java.util.Scanner;

public class Program09_NumericCharacterSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to find numeric sum ");
		String s1 = sc.next();
		int sum =  0;
		 for(int i = 0; i< s1.length(); i++) {
			 if(s1.charAt(i) >= '0' && s1.charAt(i)<= '9') {
				 sum = sum + (s1.charAt(i) - 48 );
			 }
		 }
		 
		 System.out.println("Numeric sum is :" + sum);
	}
}
