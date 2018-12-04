package ch.hslu.oop.sw5;

public class Square extends Shape {
	
	private int side;
	
	public Square(final int x, final int y, final int side) {
		super(x, y);
		this.side = side;
	}
	
	public void changeSide(final int newSide) {
		this.side = newSide;
	}
	
	public int getSide() {
		return side;
	}

	@Override
	public int getPerimeter() {
		return (4 * side);
	}

	@Override
	public int getArea() {
		return (side * side);
	}

}
