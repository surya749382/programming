package number_programming;

public class Program16_PrintAndCountPrimeNumbers {

	public static void main(String[] args) {
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\nTotal numbers of prime numbers is : " + count);
	}
	
	
	
	public static boolean isPrime(int num) {
		boolean condition = true;
		for(int i = 2; i<= Math.sqrt(num); i++) {
			if(num % i == 0) {
				condition = false;
				break;
			}
		}
		if(condition) {
			return true;
		}else {
			return false;
		}
	}
}
