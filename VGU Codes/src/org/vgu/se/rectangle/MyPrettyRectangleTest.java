package org.vgu.se.rectangle;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyPrettyRectangleTest {

	private MyPrettyRectangle left;
	private MyPrettyRectangle middle;
	private MyPrettyRectangle right; 
	private MyPrettyRectangle somewhere;
	
	/*
	 * Set-Up Method, for all test method.
	 * It will be executed before each test method is executed.
	 *
	 */
	@Before
	public void setUp() throws Exception { 
		// 
		//     +-----------+   +---+
		//     |         r |   | s |
		// +---+---+---+   |   |   |
		// | l |   | m |   |   |   |
		// |   |   +---+   |   |   |
		// |   |       |   |   |   |
		// +---+-------+   |   +---+
		//     |           |
		//     +-----------+
		//
		// Assumption: 1 Unit = 1 cm
		// MyPrettyRectangle Constructor: MyPrettyRectangle(x1,y1,x2,y2)
		// x1,y1: Point lower left
		// x2,y2: Point upper right
		
		left = new MyPrettyRectangle(0.0, 1.0, 3.0, 3.0);
		middle = new MyPrettyRectangle(2.0, 2.0, 3.0, 3.0);
		right = new MyPrettyRectangle(1.0, 0.0, 4.0, 4.0); 
		somewhere = new MyPrettyRectangle(5.0, 1.0, 6.0, 4.0);
		
	}
	
	/*
	 * Method to test a method 'contains' of class MyPrettyRectangle, which checks, whether a rectangle
	 * fully contains another rectangle. 
	 *  
	 * (Result: boolean value)
	 * 
	 */
	@Test
	public void testContains() {
		// First tests, to check the correctness of method contains()  
		assertTrue(  right.contains(middle) );
		assertTrue(  right.contains(right) );
		assertFalse(  right.contains(left) );
		assertFalse(  right.contains(somewhere) );
		
		// Please provide further assertions for a complete test with all possible combinations!
		// [Your code]

	}
	
	/*
	 * Testing method for testing a method 'getCenter' of class MyPrettyRectangle, which calculates the center point of
	 * a rectangle.
	 * 
	 * (Result: a point (object) in the coordinate system)
	 * 
	 */
	@Test
	public void testGetCenter(){
		// // First tests, to check the correctness of method getCenter() 
		assertEquals( new MyPoint(1.5, 2.0), left.getCenter() ); 
		
		// Please further assertions for calculating the center points of the rectangles right, middle, and 
		// somewhere. Please check them with the actual center points.
		// The necessary methods in the class MyPrettyRectangle should be implemented accordingly.
		// For a correct comparison of the MyPoint objects, the equals method of class java.lang.Object should be overridden!
		//
		// [your code]
		
	}  
	
	/*
	 * Testing method for testing a method 'getArea' of class MyPrettyRectangle, which calculates the area of
	 * a rectangle.
	 * 
	 * (Result: Value in square centimeter, cm2)
	 * 
	 */
	@Test
	public void testGetArea(){
		// Please add further assertions for implementing the method for calculating the rectangle
		// Please compare the target and the actual values. Please do also respect a 
		// maximum difference (delta) between expected and actual values.
		// More details: http://stackoverflow.com/questions/7554281/junit-assertions-make-the-assertion-between-floats
		
		// [your code]

	}
	
	/*
	 * Testing method for testing a method 'getPerimeter' of class MyPrettyRectangle, which calculates the area of
	 * a rectangle.
	 * 
	 * (Result: Value in centimeter, cm)
	 * 
	 */
	@Test
	public void testGetPerimeter(){
		
		// Please add assertions for implementing and testing your implementation for calculating the perimeter. 
		// Please compare the target and the actual values. Please do also respect a 
		// maximum difference (delta) between expected and actual values.
		// More details: http://stackoverflow.com/questions/7554281/junit-assertions-make-the-assertion-between-floats
		
		// [your code]
		
	}
	
	/*
	 * Method for testing the object identity among various MyPrettyRectangle objects
	 * 
	 */
	@Test
	public void testSameIdentity() {
		// Please add five assertions that checks the object identity of rectangle 'left' with all other rectangles
		// (including the new rectangle 'other'). Please use the assertions assertSame and / or assertNotSame
		// 
		// [your code]
		
		MyPrettyRectangle other = left;
		
		
		// Please add three assertions for checking the equality of rectangle objects. Please do 'also' use assertTrue here!
		// [your code]

		// Please add five further assertions that checks the object identity of rectangle 'left' with all other rectangles
		// (including the new rectangle 'other'). Please use the assertions assertTrue and / or assertFalse
		// 
		// [your code]

	}
	
	/*
	 * Method for checking the static method 'getBoundingBox' of another class called BoundingBoxFactory. When given
	 * an array of different rectangle object, this method calculates a bounding box out of that array. 
	 * 
	 * Definition Bounding Box: a bounding box defines the minimal paraxial rectangle that surrounds a given set 
	 * of rectangles. 
	 * 
	 */
	@Test
	public void testGetBoundingBox( ) {
		
		MyPrettyRectangle[] rect = {middle, right, somewhere};
		
		// Please add assertions for implementing and testing your implementation for calculating the bounding box. 
		// Please compare the target and the actual values. Please do also incorporate tests when passing an empty
		// array or a NULL reference as an input. Is there a difference between these 'critical' input values? 
		// Please use the assertions for checking the equality of objects as well as for checking NULL values (e.g., assertNull)
		//
		// [your code] 
		
		
		// Test for an empty array as an input
		//
		// [your code] 

		
		// Test for a NULL value as an input --> NULL should be returned!
		//
		// [your code] 
		
		
	}


}
