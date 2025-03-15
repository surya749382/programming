package number_programming;

import java.util.Scanner;

public class Program10_StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check the strong number : ");
		long num = sc.nextLong();
		long a = num;
		long factSum = 0;
		while(num > 0) {
			int rem = (int)(num % 10);
			
			num /=10;
			
			factSum = factSum + getFactorial(rem);
		}
		if(factSum == a) {
			System.out.println("STRONG NUMBER ");
		}else {
			System.out.println("NOT A STRONG NUMBER ");
		}
	}
	
	public static int getFactorial(int n ) {
		int i = 1;
		int fact = 1;
		while(i<=n) {
			fact = fact*i;
			i++;				
		}
		return fact;
	
}
}