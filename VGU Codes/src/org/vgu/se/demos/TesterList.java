package org.vgu.se.demos;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/*
 * List zum Beweis, dass vor jeder Test-Methode ein neues Objekt
 * von der Test-Klasse erzeugt wird. Effekt somit: die Reihenfolge
 * der Test-Methoden ist nicht zu beruecksichtigen! Etwaige Aenderungen
 * in Objektvariablen werden ueberschrieben. Somit ist dieser gueltig,
 * da die Variable List wieder neu instanziiert wird.
 * 
 * Quelle: http://martinfowler.com/bliki/JunitNewInstance.html
 * 
 */

public class TesterList {
	
	private List list = new ArrayList();
	
	@Test
	public void testFirst() {
	    list.add("one");
	    assertEquals( 1, list.size() );
	}
	
	@Test
	public void testSecond() {
	    assertEquals( 0, list.size() );
	}
	
	@Test(expected = IndexOutOfBoundsException.class) 
	public void empty() { 
	     new ArrayList<Object>().get(0); 
	}

}
