package pattern_programming;

import java.util.Scanner;

public class Program29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row  = sc.nextInt();
		for(int i= 1; i<= row; i++) {
			for(int j= 1; j<= row; j++) {
				if(i == (row+1)/2 && j == (row+1)/2 ) {
					System.out.print("* ");
				}else if(i==j) {
					System.out.print("A ");
					
				}else if(i+j == row +1) {
					System.out.print("B ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
				
	}

}
