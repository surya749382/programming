package pattern_programming;

import java.util.Scanner;

public class Program46 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int row = sc.nextInt();
		
		int star = row;
		int space =row/2;
		for(int i = 0; i <= row; i++) {
			for(int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			if(i < (row)/2) {
				star-=2;
				space++;
			}else {
				star+=2;
				space--;
			}
			System.out.println();
		}
	}
}
