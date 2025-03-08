package array_programming;

public class Program23 {
	public static void main(String[] args) {
		 int[] arr = {1, 0,0,0, 1, 1, 0, 1, 0, 1, 1, 0};
		 System.out.println("Before sorting : ");
		 for (int i : arr) {
			System.out.print(i +" ");
		}
		 int first = 0;
		 int last = arr.length-1;
		 for(int i = first; i<= last-1; i++) {
			 
			 while(arr[i]== 1) {
				 for(int k = i; k<last; k++ ) {
					 arr[k] = arr[k+1];
				 }
				 arr[last] = 1;
				 last--; 
			 }
			
		 }
		 System.out.println("\nAfter sorting : ");
		 for (int i : arr) {
			System.out.print(i +" ");
		}
		
	}
}
