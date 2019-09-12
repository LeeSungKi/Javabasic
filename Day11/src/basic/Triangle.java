package basic;

public class Triangle extends Shape{
	private double base; // πÿ∫Ø 
	private double height; // ≥Ù¿Ã 
	public Triangle() {}
	public Triangle(double b, double h) {
		setBase(b);
		setHeight(h);
	}
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		return getBase() * getHeight() * 0.5;
	}
}
