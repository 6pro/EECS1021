
public class SomePositiveV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int [] ns = {-2, -7, 4, 5, -1};
         boolean somePos = false;
         for (int i = 0; i < ns.length && !somePos; i++) {
        	 //accumulation of result between itterations
        	 
        	 somePos= somePos || ns[i] > 0;
        	 
         }
         System.out.println("Some (at least one) elements in the array is positive: " + somePos);
	}

}
