package org.vgu.se.composite;

public abstract class AbstractDocument implements Document {

	private int id;

	@Override
	public void setID(int id) {
		this.id = id;
		
	}

	@Override
	public int getID() {
		return id;
	}
}
