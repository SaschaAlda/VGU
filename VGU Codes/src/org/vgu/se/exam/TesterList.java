package org.vgu.se.exam;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TesterList {
	
	private List<Invoice> con = new ArrayList<Invoice>();
	private Invoice in3 = null;
	
	@Before
	public void setUp() throws Exception {
		in3 = new Invoice(3);
	}
	
	@Test
	public void testFirst() {
	    con.add(  new Invoice(1) );
	    assertEquals( 1, con.size() );
	    
	    // Please add further assertions after having added or deleted a single Invoice object.
	    // In total, four objects should be added and four objects should be deleted.
	    // Thus, provide eight assertions in this assignment.
	    // 
	    // [put your code in the box of assignment 4.1]
	}
	
	@Test
	public void testSecond() {
	    Invoice in1 = new Invoice(1);
	    Invoice in2 = new Invoice(2);
	    Invoice in3 = in1; 
	    this.in3 = in2;
	    
	    // Please add assertions to test the object identity for the object in variable 'in1' with all other objects
	    // that are visible in this method (including 'in1' itself). 
	    // 
	    // [put your code in the box of assignment 4.2]
	}
	
}
