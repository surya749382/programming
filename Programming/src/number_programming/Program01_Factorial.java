package number_programming;

import java.util.Scanner;

public class Program01_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to calculate the factorial : ");
		int num = sc.nextInt();
		int a = num;
		int fact = 1;
		while(num > 1) {
			fact = fact*num;
			num--;
		}
		System.out.println("The factorial of "+ a +" is " + fact);
	}
	
}
