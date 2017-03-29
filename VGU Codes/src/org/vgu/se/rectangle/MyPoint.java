package org.vgu.se.rectangle;

public class MyPoint {
	
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	public String toString(){
		return "Objekt x: " + this.x + ", y: " + this.y + ".";
	}
	
	public boolean equals( Object obj ){
		
		if ( obj instanceof MyPoint ) {
			MyPoint other = (MyPoint) obj;
		
			boolean result = this.getX() == other.getX() && this.getY() == other.getY();
			return result;
		} else 
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
