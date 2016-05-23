package convexhull;


/**
 * Write a description of class Line here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line
{
    private Point star;
    private Point end;
    private double m;
    public Line(Point star, Point end)
    {
        m = getPendienteM(star, end);
        this.star = star;
        this.end = end;
    }
    public boolean isParalleTo(Line other)
    {
        return this.m == other.m;
    }
    public Point intersect(Line line1,Line line2)
    {
        double m1 = getPendienteM(line1.star, line1.end);
        double m2 = getPendienteM(line2.star, line2.end);
        
        double x = getIntersectX(line1,m1,line2,m2);
        double y = getIntersectY(line1,m1);
        
        return new Point(x,y);
    }
    private double getPendienteM(Point star, Point end)
    {
        return ((end.getY() - star.getY())/(end.getX() - star.getX()));
    }
    private double getIntersectX(Line line1,double m1,Line line2, double m2)
    {
        return (line1.star.getY() - line2.star.getY() + m2 * line2.star.getX() - m1 * line1.star.getX()) / (m2 - m1);
    }
    private double getIntersectY(Line line,double m)
    {
        return line.end.getY() + m * line.star.getX() - m * line.end.getX();
    }
    public double length()
    {
        //Tell, don't ask. point.distance(otherPoint)
       return star.distanceTo(end);
    }
    public boolean isAtleft(Point point)
    {
        double x1 = star.getX();
        double y1 = star.getY();
        double x2 = end.getX();
        double y2 = end.getY();
        
        double a = y2 - y1;
        double b = x1 - x2;
        double c = x1 * y2 - y1 * x2;
        return a * point.getX() + b * point.getY() + a +  c < 0;
    }
}
