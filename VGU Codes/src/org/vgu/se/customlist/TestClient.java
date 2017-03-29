package org.vgu.se.customlist;

import java.util.ArrayList;

public class TestClient {

	public static void main(String[] args) {
		CustomList list = new CustomList( new ArrayList<PerformedTranslation>() );  
		
		PerformedTranslation performed1 = new PerformedTranslation();
		performed1.setUserID(1);
		
		PerformedTranslation performed2 = new PerformedTranslation();
		performed2.setUserID(2);
		
		list.add(performed1);
		list.add(performed1);
		
		int size = list.size();
		
		if (size == 2) {
			System.out.println("Target Value: 2, Actual Value: 2 --> Test Case Successful!");
		}

	}

}
