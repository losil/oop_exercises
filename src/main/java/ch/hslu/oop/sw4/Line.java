package ch.hslu.oop.sw4;

/**
 * Write a description of class Line here.
 *
 * @author (Silvan Loser)
 * @version (v1.0)
 */
public class Line
{
    private Point point1;
    private Point point2;
    
    public Line(final int x1, final int y1, final int x2, final int y2)
    {
        point1 = new Point(x1,y1);
        point2 = new Point(x2,y2);
    }

    public String getStartPoint()
    {
       
        return point1.getPoint();
    }
    
    public String getEndPoint()
    {
        return point2.getPoint();
    }
    
    public void setStartPoint(final int x, final int y) {
        point1.setPoint(x,y);
    }
    
    public void setEndPoint(final int x, final int y) {
        point2.setPoint(x,y);
    }
}
