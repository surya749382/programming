package pattern_programming;

import java.util.Scanner;

public class Program27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row  = sc.nextInt();
		for(int i= 1; i<= row; i++) {
			for(int j= 1; j<= row; j++) {
				if(i==1|| j==1 || i == row || j == row) {
					System.out.print("* ");
				}else if(i==2 || j== 2 || i == row-1|| j== row-1) {
					System.out.print("@ ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
				
	}

}
