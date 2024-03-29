
public class Cylinder extends Circle {
	
	private double height;
	
	public Cylinder(double radius, double height) {
		super(radius,null);
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	
	public double getVolume() {
		return super.getArea() * getHeight();
		
	}
	
	@Override
	public double getArea() {
		return Math.PI * (getHeight() + getRadius());		
	}
	
	@Override
	public String toString() {
		return "height = "+this.height+","+super.toString();
	}

}
