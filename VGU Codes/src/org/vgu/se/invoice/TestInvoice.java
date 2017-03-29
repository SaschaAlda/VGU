package org.vgu.se.invoice;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestInvoice {
	
	private Invoice b1 = null;
	private Invoice b2 = null;

	@Before
	public void setUp() throws Exception {
		b1 = new Invoice(200 , "EUR");
		b2 = new Invoice(200 , "EUR");
	}


	@Test 
	public void testEquality() {
		assertEquals( b1, b2 );	
		
	}
	
	@Test
	public void testSameIdentity(){ 
		assertSame( b1, b1 );
		
	}
	
	@Test
	public void testNotSameIdentity(){
		assertNotSame( b1 , b2 ); 
	}
	
	@Test
	public void testExamples(){
		Invoice b3 = b1;
		assertEquals ( b3 , b1 );
		assertSame ( b1 , b3 );
		assertFalse ( b1 != b3 ); 
	}
	
}
