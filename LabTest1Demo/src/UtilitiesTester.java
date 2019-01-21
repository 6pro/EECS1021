
public class UtilitiesTester {

	public static void main(String[] args) {
		Utilities u = new Utilities();
		
		System.out.println("(1)=========================");
		System.out.println("squareOf(-2): " + u.squareOf(-2));
		System.out.println("(2)=========================");
		System.out.println("squareOf(-3): " + u.squareOf(-3));
		// new test case for sqrroot of 4 added
		System.out.println("(9)=========================");
		System.out.println("squareOf(4): " + u.squareOf(4));
		
		System.out.println("(3)=========================");
		System.out.println("averageOf(3.0, 4.0): " + u.averageOf(3.0, 4.0));
		
		System.out.println("(4)=========================");
		System.out.println("isPositive(4): " + u.isPositive(4));
		System.out.println("(5)=========================");
		System.out.println("isPositive(0): " + u.isPositive(0));
		System.out.println("(6)=========================");
		System.out.println("isPositive(-5): " + u.isPositive(-5));
		
		System.out.println("(7)=========================");
		System.out.println("concatenate('L', \"Hello\", \"World\"): " + u.concatenate('L', "Hello", "World"));
		System.out.println("(8)=========================");
		System.out.println("concatenate('R', \"Hello\", \"World\"): "+ u.concatenate('R', "Hello", "World"));
	}

}
