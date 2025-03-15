package number_programming;

import java.util.Scanner;

public class Program09_EvenDigitFactorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to print the factorial of even digit : ");
		long num = sc.nextLong();
		
		while(num > 0) {
			int rem = (int)(num % 10);
			
			num /=10;
			
			if(rem % 2 == 0 ) {
				System.out.println("the factorial of " +rem+ " is "+ getFactorial(rem) );
			}
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
