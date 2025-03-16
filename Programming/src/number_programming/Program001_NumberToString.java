package number_programming;

import java.util.Scanner;

public class Program001_NumberToString {
	public static void main(String args[]) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		String convertedString = converNumberToString(num);
		System.out.println(convertedString);
		
	}
	public static String converNumberToString(int num) {
		String[] digitWord = { "zero","one","two","three","four","five","six","seven","eight","nine" };
		String numStr = Integer.toString(num);
		StringBuilder result = new StringBuilder();
		
		for(char digit : numStr.toCharArray()) {
			int digitValue = digit - '0';
			result = result.append(digitWord[digitValue] +" ");
		}	
		return result.toString();
	}
}
70000001