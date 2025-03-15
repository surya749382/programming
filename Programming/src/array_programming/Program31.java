
package array_programming;

public class Program31 {

	public static void main(String[] args) {
		int[] a = { 12, 12, 23, 23, 12, 45, 12, 76, 1001, 1001, 20, 12 };
		int[] b = {};

		getMaxFrequency(a);

	}

	public static void getMaxFrequency(int[] a) {
		if (a.length == 0) {
			System.out.println("Provided array is empty");
			return;
		}
		
		
		int start = 0;
		int end = a.length - 1;
		int maxElement = a[0];
		int maxFrequency = 1;

		for (int i = start; i < end; i++) {
			int count = 1;
			for (int j = i + 1; j <= end; j++) {
				if (a[i] == a[j]) {
					count++;
					int temp = a[j];
					a[j] = a[end];
					a[end] = temp;
					end--;
					j--;

				}
			}

			if (count > maxFrequency) {
				maxElement = a[i];
				maxFrequency = count;
				System.out.println("The maximum frequency of " + maxElement + " is : " + maxFrequency);

			}

		}
	}
}
