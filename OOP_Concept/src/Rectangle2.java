
public class Rectangle2 implements Shape2 {
	
	private double width;
	private double length;
	
	
	public Rectangle2 (double width,double length,String color) {
		this.width = width;
		this.length = length;
		
		
	}
	
	public double getArea() {
		return this.width *  this.length;
	}
	
	public String toString() {
		return "Rectangle width = "+ getWidth() +", length = " +getLength();
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public double getLength() {
		return this.length;
	}

	
	}



