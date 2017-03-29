package org.vgu.se.rectangle;

public class BoundingBoxFactory {

	public static MyPrettyRectangle getBoundingBox( MyPrettyRectangle[] rect ) {
		
		// if NULL is passed, the NULL will be returned
		if (rect == null) return null;
		
		// if the array does not contain any rectangles at all, then
		// a bounding box with coordinates (0,0,0,0) will be returned.
		if ( rect.length == 0 ) {
			return new MyPrettyRectangle( 0 , 0 , 0 , 0 ); 
		}
		
		// Identifying the first rectangle as a starting point
		double minx1 = rect[0].getX1();
		double miny1 = rect[0].getY1();
		double minx2 = rect[0].getX2();
		double miny2 = rect[0].getY2(); 
		
		// int length = rect.length;
		
		for ( MyPrettyRectangle rec : rect ) {
			if ( rec.getX1()<=minx1 )  minx1 = rec.getX1();
			if ( rec.getY1()<=miny1 )  miny1 = rec.getY1();
			if ( rec.getX2()>=minx2 )  minx2 = rec.getX2();
			if ( rec.getY2()>=miny2 )  miny2 = rec.getY2();
		}
		return new MyPrettyRectangle( minx1 , miny1 , minx2 , miny2 );
	}

}
