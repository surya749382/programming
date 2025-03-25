package array_programming;

public class Program005_Selection_Sort {
	public static void main(String[] args) {
		int[] arr = {5,4,1,3,2};
		
		selectionSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void selectionSort(int[] a) {
		for(int i = 0; i < a.length -1; i++) {
			int minPos = i;
			
			// choosing the position of minimum element
			for(int j = i+1; j < a.length; j++) {
				if(a[minPos] > a[j]) {
					minPos= j;
				}
			}
			// swapping
			 int temp = a[i];
			 a[i] = a[minPos];
			 a[minPos] = temp;
					
		}
		
	}

}
