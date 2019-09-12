package quiz;


import basic.Circle;
import basic.Rectangle;
import basic.Shape;
import basic.Triangle;

public class Quiz01 {
	
	public static final int TAG_CIRCLE = 0;
	public static final int TAG_TRIANGLE = 1;
	public static final int TAG_RECTANGLE = 2;
	public static final int NUMBER_SHAPE = 3;
	
	public static void main(String[] args) {
		Shape[] s = new Shape[5];
		for(int i = 0; i < s.length; ++i) {
			int rand = (int)(Math.random() * NUMBER_SHAPE);
			switch(rand) {
			case TAG_CIRCLE:
				s[i] = new Circle( (int)(Math.random() * 90) + 10);
				break;
			case TAG_RECTANGLE:
				s[i] = new Rectangle( (int)(Math.random() * 90) + 10, 
											(int)(Math.random() * 90) + 10);
				break;
			case TAG_TRIANGLE:
				s[i] = new Triangle( (int)(Math.random() * 90) + 10, 
											(int)(Math.random() * 90) + 10);
				break;
			}
		}
		
		for(Shape sh : s) {
			String className = sh.getClass().getSimpleName();
			System.out.println(className +" µµÇü ³ÐÀÌ : " + sh.getArea());
		}
	}
}






