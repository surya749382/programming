package array_programming;

public class Program15 {

	public static void main(String[] args) {
		int numbers[] = { 7483, 34322, 42, 342, 23, 43, 19, 27, 17 };
		int primeNumCount = 0;
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[i];
			int count = 0;
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					count++;
					break;
				}	

			}
			if (count == 0) {
				System.out.print(num + " ");
				primeNumCount++;
			}
		}
		System.out.println("\nTotal number of prime numbers is : " + primeNumCount);
	}
}
