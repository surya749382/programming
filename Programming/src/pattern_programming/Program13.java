package pattern_programming;

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		for(int i=0; i<row; i++) {
			for(int j=1; j<=row-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
