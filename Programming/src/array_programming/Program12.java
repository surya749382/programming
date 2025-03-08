package array_programming;

public class Program12 {

	public static void main(String[] args) {
		String arr[] = { "Surya", "Pratik", "Rahul", "Shreyansh", "Prince", "Anshika", "Sakshi", "Anuradha" };
		insertElement(7, "Arushi", arr);
	}

	public static void insertElement(int i,String str, String[] array) {
		if (array.length < i) {
			System.out.println("Provided index is not present in Array");
			return;
		}
		String newArray[] = new String[array.length + 1];
		for (int k = 0; k <= array.length; k++) {
			if(k < i) {
			newArray[k] = array[k];
			}
			if(k == i) {
				newArray[k] = str;
			}
			if(k > i ) {
				newArray[k] = array[k-1];
			}
		}
		for (int j = 0; j < newArray.length; j++) {
			System.out.print(newArray[j] +" ");
		}
	}
}
