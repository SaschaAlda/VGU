package org.vgu.se.app;

public class Computer {

	public int add(int i, int j) {
		int sum = i + j;
		
		if (sum > 1000 ) {
			return 1000;
		}
		
		return sum;
	}
	
	

}
