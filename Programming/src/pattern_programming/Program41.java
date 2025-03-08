package pattern_programming;

import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		int star = 2*row -1;
		int space = 0;
		for(int i=1; i <= row; i++) {
			for(int j= 1; j<= space; j++) {
				System.out.print("  ");
			}
			for(int j=star; j >=1 ; j--) {
				System.out.print("* ");
			}
			
			star-=2;
			space+=1;
			System.out.println();
		}
	}
}
