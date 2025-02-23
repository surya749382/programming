package pattern_programming;

import java.util.Scanner;

public class Program15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of row : ");
		int row = sc.nextInt();
		int num = 1;
		for(int i=1; i<=row; i++) {
			for(int j=1; j<=row; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
