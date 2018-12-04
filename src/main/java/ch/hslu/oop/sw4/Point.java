package ch.hslu.oop.sw4;
/**
 * Class Point tells you the quadrant of a point.
 *
 * @author (Silvan Loser)
 * @version (v1.0)
 */
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
	   
	   
}
