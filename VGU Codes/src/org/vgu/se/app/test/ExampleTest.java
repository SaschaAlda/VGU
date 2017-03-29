package org.vgu.se.app.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.vgu.se.app.Computer;

public class ExampleTest {
	
	private Computer cm = null;
	
	@Before
	public void setup() throws Exception {
		cm = new Computer();
	}
	
	@Test
	public void test1() {
		int actualResult = cm.add( 10 , 20 );
		assertEquals( 30 , actualResult );
		assertEquals( "Addition of Result 40" , 40, cm.add( 20, 20 ) );
	}
	
	@Test
	public void test2() {		
		int actualResult = cm.add( 1000 , 2000 );
		assertEquals( 1000, actualResult );
	}



}
