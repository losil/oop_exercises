package ch.hslu.oop.sw5;

public abstract class Shape {
	
	private int x;
	private int y;
	
	protected Shape(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move(final int newX, final int newY) {
		this.x = newX;
		this.y = newY;
	}

	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public abstract int getPerimeter();
	
	public abstract int getArea();
		
	
}
