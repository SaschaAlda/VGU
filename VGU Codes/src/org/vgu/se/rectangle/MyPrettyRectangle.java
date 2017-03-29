package org.vgu.se.rectangle;

public class MyPrettyRectangle {
	
	private double x1;
	private double y1;
	
	public double getX1() {
		return x1;
	}

	public void setX1(double x1) {
		this.x1 = x1;
	}

	public double getY1() {
		return y1;
	}

	public void setY1(double y1) {
		this.y1 = y1;
	}

	public double getX2() {
		return x2;
	}

	public void setX2(double x2) {
		this.x2 = x2;
	}

	public double getY2() {
		return y2;
	}

	public void setY2(double y2) {
		this.y2 = y2;
	}

	private double x2;
	private double y2;

	public MyPrettyRectangle(double i, double j, double k, double l) {
		this.x1 = i;
		this.y1 = j;
		this.x2 = k;
		this.y2 = l;
	}

	public boolean contains(MyPrettyRectangle rec) {
		if  (( rec.getX1() >= this.x1  && 
				 rec.getY1() >= this.y1 && 
				rec.getX2() <= this.x2  &&
				rec.getY2() <= this.y2) ) {
			return true;
		}
		else {
			return false;
		}
	}

	public double getArea() {
		return (this.x2 - this.x1) * (this.y2 - this.y1);
	}
	
	public double getPerimeter() {
		double laenge1 = this.x2 - this.x1;
		double laenge2 = this.y2 - this.y1;
		
		double umfang = (2*laenge1) + (2*laenge2);
		return umfang;
	} 

	public MyPoint getCenter() {
		double x = (this.x1 + this.x2 ) / 2;
		double y = (this.y1 + this.y2 ) / 2;
		
		MyPoint point = new MyPoint ( x ,y );
				
		return point;
	} 
	
	public String toString(){
		return "MyPrettyRectangle (" + this.x1 + ", " + this.y1 + ", " + this.x2 + ", " + this.y2 + ")";
	}
	
	public boolean equals( Object obj ){
		MyPrettyRectangle other = (MyPrettyRectangle) obj;
		
		boolean result = this.getX1() == other.getX1() && this.getY1() == other.getY1() && this.getX2() == other.getX2() && this.getY2() == other.getY2();
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
