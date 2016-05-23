package convexhull;

import java.util.*;
//import java.util.stream.*;
/**
 * Write a description of class PointSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PointSet
{
    //private Point[] points = new Point[2];
    //private int size = 0;
    private Set<Point> points;
    
    public PointSet()
    {
        points = new HashSet<Point>();
    }
    
    public int size()
    {
        return this.points.size();
    }
    public void add(Point element)
    {
        /*boolean exists = elementsExists(element);
        if(!exists)
        {
             points.add(element);
        }*/
        /*if(!points.contains(el -> el.getX() == elemtent.getX()))
        {
            this.points.add(element);
        }*/
        this.points.add(element);
        System.out.println(this.points);
    }
    public boolean elementsExists(Point element)
    {
        boolean exists = false;
        for(Point point:this.points)
        {
           if(point.equals(element))
           {
               exists = true;
           }
        }
        return exists;
    }
}
