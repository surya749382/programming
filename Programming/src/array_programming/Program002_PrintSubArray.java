package array_programming;

public class Program002_PrintSubArray {
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,10};
		printSubArray(arr);

	}
	public static void printSubArray(int[] a) {
		 int totalSubArray = 0;
		int start = 0;
		int end = a.length-1;
		
		for(int i = start; i <= end; i++ ) {
			for(int j =i ; j <= end; j++) {
				for(int k = i; k <= j; k++) {
					System.out.print(a[k]+" ");
					
				}
				totalSubArray++;		
				System.out.print("    ");
				
			}
			System.out.println();
		}
		System.out.println("Total Sub Array are : "+ totalSubArray);
		
	}
}
