package array_programming;

public class Program004_BubbleSort {
	public static void main(String[] args) {
		
		int[] arr = {5,4,1,3,2};
		
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + " ");
		}
		
		
		
	}
	public static void bubbleSort(int[] a) {
		for(int turn = 0; turn < a.length-1; turn++ ) {
			for(int j = 0; j < a.length-1-turn; j++) {
				if(a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
		}
	}

}
