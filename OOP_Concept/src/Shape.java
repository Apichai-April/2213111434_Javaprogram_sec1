
public abstract class Shape {
	
	protected String color;
	
	public Shape() {
		this.color = null;
	}
	
	public Shape(String color) {
		this.color = color;
	}
	
	public abstract double getArea();
	
	
	public String toString() {
		return "color = "+this.color; 
	}
		


}
