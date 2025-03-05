package pattern_programming;

import java.util.Scanner;

public class Program30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row  = sc.nextInt();
		char ver = 'A';
		char hor = 'A';
		for(int i= 1; i<= row; i++) {
			for(int j= 1; j<= row; j++) {
				if(i == (row+1)/2 && j == (row+1)/2 ) {
					System.out.print("* ");
				}else if(j == (row+1)/2) { // vertical
					System.out.print(ver + " ");
					ver = (char)(ver+1);
					
				}else if(i==(row+1)/2) { // horizontal
					System.out.print(hor + " ");
					hor = (char)(hor + 1);
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
				
	}

}
