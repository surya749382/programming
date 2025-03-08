package array_programming;

public class Program05{

	public static void main(String[] args) {
		int arr[] = { 11, 122, 3, 2234, 325, 632, 732332, 8, 329 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			
			count = count+arr[i];
			}
		
		System.out.println("Sum of all elements is "+ count);
		System.out.println("Average of all elements is "+ count/(double)(arr.length));
	}
}
