package array_programming;

public class Program19 {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 System.out.println("Array befor rotation : ");
		 for (int i : arr) {
			System.out.print(i +" ");
		}
		 
		 rotateLeftK(3, arr);
		 	
		 // for printing the array
		 System.out.println("\nArray after rotation : ");
		 for (int i : arr) {
			System.out.print(i + " ");
		}
		 
	}
	public static void rotateLeftK(int i, int[] arr) {
		for(int k = 1; k<= i; k++) {
			int firstElement = arr[0];
			 for (int j = 0; j < arr.length-1; j++) {
				 arr[j] = arr[j+1];
					}
			 arr[arr.length-1]= firstElement;
		}
	}
}
