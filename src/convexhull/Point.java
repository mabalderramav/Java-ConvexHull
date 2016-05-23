package convexhull;
import java.util.*;

/**
 * Write a description of class Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Point implements Comparable
{
    private double x;
    private double y;
    public void setX(double x)
    {
        this.x = x;
    }
    public double getX()
    {
        return this.x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public double getY()
    {
        return this.y;
    }
    public Point()
    {
       x = 0;
       y = 0;
    }
    public Point(double x,double y)
    {
       this.x = x;
       this.y = y;
    }
    public double distanceTo(Point other)
    {
        return Math.sqrt(Math.pow(other.getX() - this.getX(),2) + Math.pow(other.getY() - this.getY(),2));
    }
    @Override
    public boolean equals(Object other)
    {
//        point.getX() == element.getX() && point.getY() == element.getY()
        Point otherPoint = (Point) other;
        return this.getX() == otherPoint.getX() && this.getY()  == otherPoint.getY();
    }
    @Override
    public int compareTo(Object other)
    {
        if(this.equals(other))
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
    @Override
    public int hashCode()
    {
        return (int)(x * 10000000 + y * 1000);
    }
}
