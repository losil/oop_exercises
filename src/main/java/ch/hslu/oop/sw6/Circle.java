/**
 * 
 */
package ch.hslu.oop.sw6;

/**
 * @author silvan
 *
 */
public class Circle extends Shape {
	
	private int diameter;
	
	public Circle(final int x, final int y, final int diameter) {
		super(x,y);
		this.diameter = diameter;
	}
	
	public void setDiameter(final int newDiameter) {
		this.diameter = newDiameter;
	}
	
	public int getDiameter() {
		return this.diameter;
	}
	
	@Override
	public int getPerimeter() {
		return (int) (Math.PI * this.diameter);
	}
	
	@Override
	public int getArea() {
		int radius = diameter / 2;
		return (int) (Math.PI * (radius * radius));
	}

}

