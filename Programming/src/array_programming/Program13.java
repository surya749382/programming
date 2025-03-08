package array_programming;

public class Program13 {

	public static void main(String[] args) {
		String arr[] = { "Surya", "Pratik", "Rahul", "Shreyansh", "Prince", "Anshika", "Sakshi", "Anuradha" };
		remmoveElement(2, arr);
	}

	public static void remmoveElement(int i ,String[] array) {
		if (array.length < i) {
			System.out.println("Provided index is not present in Array");
			return;
		}
		String newArray[] = new String[array.length - 1];
		for (int k = 0; k < newArray.length; k++) {
			if(k < i) {
			newArray[k] = array[k];
			}
			
			if(k >= i ) {
				newArray[k] = array[k+1];
			}
		}
		for (int j = 0; j < newArray.length; j++) {
			System.out.print(newArray[j] +" ");
		}
	}
}
