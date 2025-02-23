package pattern_programming;

import java.util.Scanner;

public class Program12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		int space = row - 1;
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}

			space--;
			System.out.println();
		}

	}

}
