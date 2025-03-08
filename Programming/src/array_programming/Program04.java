package array_programming;

public class Program04{

	public static void main(String[] args) {
		int arr[] = { 11, 122, 3, 2234, 325, 632, 732332, 8, 329, 10322221 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >=100 && arr[i] < 1000) {
				System.out.print(arr[i] + " ");
				count++;
			}
		}
		System.out.println("\n"+count);
	}
}
