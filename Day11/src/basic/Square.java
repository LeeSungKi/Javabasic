package basic;

public class Square extends Shape{
	public double base;
	
	@Override
	public double getArea() {
		return Math.pow(base, 2); 
	}
}
