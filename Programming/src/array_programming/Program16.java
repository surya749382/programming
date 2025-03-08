package array_programming;

public class Program16 {
	public static void main(String[] args) {
		 int[] arr = {1, 2, 3, 4, 5};
		 
		 int lastElement = arr[arr.length -1];
		 for (int i = arr.length-1; i >= 0; i--) {
			 if(i==0) {
					arr[0]= lastElement;
					break;
				}
			arr[i] = arr[i-1];		
			
		}
		 for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		 
	}
}
