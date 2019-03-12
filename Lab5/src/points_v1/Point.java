package points_v1;

/*
 * This class is a template for 2-D points.
 * At runtime, we may instantiate as many 2-D point instances as we wish.
 */
public class Point {
	/*
	 * Attributes: class-level variable.
	 * The scope of attributes are every method in the current class.
	 */
	double x; //typically you do not initialize the attributes here.
	double y;

	/*
	 * Constructors: "methods" for cunstructing new instance of Point
	 * Note: Here we are DEFINING constructors.
	 * Rule: name of constructor must be the SAME as the class name.
	 */

	// Version 1: create a new Point using two values for x and y.
	Point(double newX, double newY) {
		x = newX;
		y = newY;
		// newX = x; not right: you should never re-assign input paramter
	}

	// Version 2: create a new Point either along the x-axis or along the y-axis.
	Point(char axis, double distance) {
		if (axis == 'x') {
			x = distance;
			y = 0;
		}
		else {
			x = 0;
			y = distance;
		}
	}

	/*
	 * Adding these two versions of constructors will give a compile-time error.
	 * Because from the compiler's point of view,
	 * both are expecting a single double value, so when you call Point(3.4),
	 * it is confusing as to which verison to call. Hence the compile-time error.
	 */

	//	Point (double distanceFromXAxis) {
	//		
	//	}
	//	
	//	Point (double distanceFromYAxis) {
	//		
	//	}
}
