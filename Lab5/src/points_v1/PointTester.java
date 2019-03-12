package points_v1;

public class PointTester {

	public static void main(String[] args) {
		/*
		 * Create point objects.
		 */
		//This is where we CALL/USE the constructor.
		Point p1 = new Point(3, -4); //Calling the 1st version of constructor
		Point p2 = new Point(-2, -7); //Calling the 1st version of constructor
		Point p3 = new Point('y', 8); //Calling the 2nd version of constructor
		Point p4 = new Point('x', -5); //Calling the 2nd version of constructor
		
		System.out.println(p1); // prints out pseudo-address
		System.out.println(p2);
		System.out.println("p1 and p2 stores diffferent addresses: " + (p1 != p2));
		System.out.println("p1 and p2 stores same address: " + (p1 == p2));
		System.out.println(p3);
		System.out.println(p4);
		
	}
}
