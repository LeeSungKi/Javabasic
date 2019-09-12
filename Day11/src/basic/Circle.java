package basic;

public class Circle extends Shape{
	private double radius;
	
	// »ı¼ºÀÚ
	public Circle(){ }
	public Circle(double r) {
		setRadius(r);
	}
	
	// getter, setter
	public double getRadius() { return radius;}
	public void setRadius(double r) { radius = r; }
	
	@Override
	public double getArea() {
		//return radius * radius * 3.14;
		return Math.pow(radius, 2) * Math.PI;
	}
	
}
