package number_programming;
import java.util.Scanner;

public class Program03_AllFactors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to count the factors : ");
		int num = sc.nextInt();
		
		int i = 1;
		int count = 0;
		while(i <= num/2) {
			if(num%i == 0) {
				count++;
				System.out.print(i +" ");
			}
			i++;
			
		}
		System.out.println("\nTotal number of factor is "+ count);
	}
}
