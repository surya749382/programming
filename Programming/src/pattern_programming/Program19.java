package pattern_programming;

import java.util.Scanner;

public class Program19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		for(int i = 1; i <= row ; i++) {
			for(int j=1; j<=row-i+1; j++) {
				System.out.print((j+1)%2 +" ");
			}
			System.out.println();
		}
	}

}
