package number_programming;

public class Program21_ArmstrongNumber {
	public static void main(String[] args) {

		System.out.println(isArmstrong(153));
	}

	public static int getDigitCount(int num) {

		int count = 0;
		while (num > 0) {
			count++;
			num /= 10;
		}
		return count;

	}

	public static boolean isArmstrong(int num) {
		int digit = getDigitCount(num);
		int a = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;

			sum = sum + (int) (Math.pow(rem, digit));
			num /= 10;
		}
		if (a == sum) {
			return true;
		} else {
			return false;
		}
	}
}
