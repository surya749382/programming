package array_programming;

public class Program18 {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 System.out.println("Array befor rotation : ");
		 for (int i : arr) {
			System.out.print(i +" ");
		}
		 int firstElement = arr[0];
		 for (int i = 0; i < arr.length-1; i++) {
			 arr[i] = arr[i+1];
				}
		 arr[arr.length-1]= firstElement;	
		 // for printing the array
		 System.out.println("\nArray after rotation : ");
		 for (int i : arr) {
			System.out.print(i + " ");
		}
		 
	}
}
