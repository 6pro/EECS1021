
public class IsSorted {
/*
 * we solve this problem by applying what we learned in V4 of AllPos
 */
	public static void main(String[] args) {
	   int [] ns = {1, 2, 2, 4};
	   boolean isSorted = true;
	   for(int i = 0; isSorted && i < ns.length-1; i++) {
		   isSorted = ns[i] <= ns[i + 1];
	   }
	   System.out.println("Array is sorted: " + isSorted);
		
	}

}
