package convexhull;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import convexhull.Point;

/**
 * The test class PointTes.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PointTes
{
    @Test
   public void createPointWithoutParameters()
   {
       Point myPoint = new Point();
       
       assertTrue(myPoint instanceof Point);
       assertEquals(0, myPoint.getX(),0);
       assertEquals(0, myPoint.getY(),0);
    }
    @Test
    public void createPointWithXandYParameters()
    {
        Point myPoint = new Point(3,4);
        assertEquals(3,myPoint.getX(),0);
        assertEquals(4,myPoint.getY(),0);
    }
     @Test
    public void testPointIsEqualToOtherWithTheSameCoordinates()
    {
        Point myPoint = new Point(3,4);
        assertTrue(myPoint.equals(new Point(3,4)));
    }
    @Test
    public void testPointIsNotEquals()
    {
        Point myPoint = new Point(3,4);
        assertFalse(myPoint.equals(new Point(5,4)));
    }
    @Test
    public void testPointsWithSomeCoordinateReturnTheSameHashCode()
    {
        Point firstPoint = new Point(3,4);
        Point secondPoint = new Point(3,4);
        assertEquals(firstPoint.hashCode(),secondPoint.hashCode());
    }
}
