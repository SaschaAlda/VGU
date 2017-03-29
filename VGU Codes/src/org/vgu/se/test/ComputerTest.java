package org.vgu.se.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.vgu.se.app.Computer;

public class ComputerTest {

	@Test
	public void addTest() {
		Computer compute = new Computer();
		int result = compute.add( 10, 20 );
		assertEquals ( "First adding test: " , 30, result );
	}
	 
	@Test
	public void addTest2() {
		Computer compute = new Computer();
		int result = compute.add( 10, 2000);
		assertEquals ( "Second adding test: " , 1000, result );
		assertSame("hdhd" , compute , compute );
	}
	
  

}
