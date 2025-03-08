package array_programming;

public class Program22 {

	public static void main(String[] args) {
		 int[] arr = {1, 0,0,0, 3, 4, 0, 6, 0, 8, 9, 10};
		 System.out.println("Array befor rotation : ");
		 for (int i : arr) {
			System.out.print(i +" ");
		}
		 int first = 0;
		 int last = arr.length-1;
		 for(int i = first; i<=last; i++) {
			 while(arr[i] == 0) {
				 for(int j = i; j<last; j++) {
					 arr[j] = arr[j+1];
				 }
				 arr[last] = 0;
				 last--;
			 }
		 }
		 System.out.println("\nAfter shifting all 0s in last : ");
		 for (int i : arr) {
			System.out.print(i + " ");
		}
	}
}
