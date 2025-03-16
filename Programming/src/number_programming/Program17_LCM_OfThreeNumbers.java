package number_programming;

import java.util.Scanner;

public class Program17_LCM_OfThreeNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		
		int max = a>b ? (a>c? a : c) : (b>c? b : c);
		System.out.println("Maximum number is :" + max);
		
		int lcm = max;
		while(!(lcm%a == 0 && lcm%b == 0 && lcm % c== 0) ) {
			
				lcm = lcm+ max;
				
			
		}
			
		
		System.out.println("The LCM of "+a+","+b+","+c+" is :" + lcm);
	}

}
