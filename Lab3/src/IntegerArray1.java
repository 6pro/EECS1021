
public class IntegerArray1 {

	public static void main(String[] args) {
		/* for any give array
		 * 1. indices always start with o
		 * 2. The size of array is that last index value + 1
		 * 3. all elements are of the same type.
		 * 
		 */
		// approach 1: array initializer notation (comma-seperated values)
		int[] ia = {940,880,830,790,750,660,650,590,510,440};
		System.out.println("size of the array\"ia\":" + ia.length);
		System.out.println("first index of the array is: " + "0");
		System.out.println("last index of the array is: " + (ia.length - 1));
		
		System.out.println("element of ia at index 0: " + ia[0]);
		System.out.println("element of ia at index 1: " + ia[1]);
		System.out.println("element of ia at index 2: " + ia[2]);
		System.out.println("element of ia at index 3: " + ia[3]);
		System.out.println("element of ia at index 4: " + ia[4]);
		System.out.println("element of ia at index 5: " + ia[5]);
		System.out.println("element of ia at index 6: " + ia[6]);
		System.out.println("element of ia at index 7: " + ia[7]);
		System.out.println("element of ia at index 8: " + ia[8]);
		System.out.println("element of ia at index 9: " + ia[9]);
		/*
		 * constaint on the array initializer notation
		 * you cannot re_assign an array using the initializer.
		 */
		// ia = {940,880,830,790,660,650,590,510};
		for(int i = 0; i<= 9; i ++) {
			System.out.println("element of ia at index " + i + ":" + ia[i]);
		}
		
	}

}
