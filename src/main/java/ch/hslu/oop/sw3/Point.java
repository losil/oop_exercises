package ch.hslu.oop.sw3;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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
}
