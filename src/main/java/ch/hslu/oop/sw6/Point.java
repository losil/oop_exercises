package ch.hslu.oop.sw6;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(Point point) {
		this(point.getX(), point.getY());
	}
	
	public String getQuadrant() {
		if(x >= 0 && y >= 0 ) {
			return "Quadrant: I";
		}
		else if (x < 0 && y >= 0 ) {
			return "Quadrant: II";
		}
		
		else if (x < 0 && y < 0 ) {
			return "Quadrant: III";
		}
		
		else {
			return "Quadrant: IV";
		}
	}
	
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public String getPoint() {
	    return this.x + "/" + this.y;
	}
	
	public void setPoint(final int x, final int y ) {
	    this.x = x;
	    this.y = y;
	   }
	
	public void setX(final int x) {
	    this.x = x;
	   }
	   
	public void setY(final int y) {
	    this.y = y;
	   }
	
	public void moveRelative(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public void moveRelative(Point point) {
		this.x += point.getX();
		this.y += point.getY();
	}
	
	public void moveRelative(double winkel, int radius) {
		this.x += radius * Math.cos(winkel);
		this.y += radius * Math.sin(winkel);
	}
}
