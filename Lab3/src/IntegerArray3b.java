public class IntegerArray3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ia = new int [5];
		
		/*
		 * In this first version, the value of loop counter i
		 * denotes the value to be stored at the array.
		 * Here the term number starts with 0, and we use the following formula:
		 * value = 7 + term * 3
		 */

		for (int i = 0; i <= 4; i ++) {
			ia[i] = 7 + i * 3;
		}
		
		/*
		 * Print out the element of the array one by one.
		 */
		for (int i = 0; i < ia.length; i++) {
			System.out.println("Element of ia at index " + i + " is: " + ia[i]);
		}
	}	

}