package org.vgu.se.exam;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TesterExceptionList {
	
	@Test(expected = IndexOutOfBoundsException.class) 
	public void empty() { 
	     new ArrayList<Object>().get(0); 
	}

}
