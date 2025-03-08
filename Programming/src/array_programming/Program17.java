package array_programming;

public class Program17 {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		 System.out.println("Array before rotation: ");
		 for(int x : arr) {
			 System.out.print(x+ " ");
		 }
		 rotateK(3, arr);
		System.out.println("\nArray after rotation:");
		for(int x : arr) {
			System.out.print(x +" ");
		}
		 
	}
	public static void rotateK(int k, int array[]) {
		for(int j = 1; j <=k; j++ ) {
			
			int lastElement = array[array.length -1];
			 for (int i = array.length-1; i >= 0; i--) {
				 if(i==0) {
						array[0]= lastElement;
						break;
					}
				array[i] = array[i-1];		
				
			}
		}	 
	 }
	
}
