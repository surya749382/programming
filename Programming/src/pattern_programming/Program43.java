package pattern_programming;

import java.util.Scanner;

public class Program43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		int star = 1;
		int space =row/2;
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			if(i < (row+1)/2) {
				star++;
				space--;
			}else {
				star--;
				space++;
			}
			System.out.println();
		}
	}
}
