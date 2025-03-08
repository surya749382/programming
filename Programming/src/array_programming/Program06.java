package array_programming;

public class Program06{

	public static void main(String[] args) {
		int arr[] = { 11, 122, 3, 2234, 325, 632, 732332, 8, 329 };
		int biggest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>biggest) {
				biggest = arr[i];
			}
			if(arr[i]< smallest) {
				smallest = arr[i];
			}
			
			}
		int difference = biggest-smallest;
		
		System.out.println("Biggest element is : "+ biggest);
		System.out.println("smallest element is : "+ smallest);
		System.out.println("Difference between biggest and smallest is : " + difference);
		
	}
}
