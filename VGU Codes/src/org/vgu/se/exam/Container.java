package org.vgu.se.exam;

import java.util.ArrayList;
import java.util.List;

public class Container {
	
	private List<Invoice> liste = new ArrayList<Invoice>();
	
	public void add(  Invoice in ) {
		liste.add( in );
	}
	
	public void remove (  Invoice in ) {
		liste.remove(in.getId() );
	}

	public int size() {
		return liste.size();
	}
	
}
