package convexhull;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LineTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LineTest
{
    @Test
    public void testLineCanBeCreateWith2Points()
    {
        Point firstPoint = new Point();
        Point secondsPoint = new Point(3,4);
        
        Line line = new Line(firstPoint,secondsPoint);
    }
    @Test
    public void testLineIsParallelToItselft()
    {
         Line line = new Line(new Point(),new Point(3,5));
         assertTrue(line.isParalleTo(line));
    }
    @Test
    public void testLineIsParalleToAnotherWithSameMValue()
    {
        Line firstLine = new Line(new Point(),new Point(5,3));
        Line secondstLine = new Line(new Point(0,2),new Point(5,5));
        assertTrue(firstLine.isParalleTo(secondstLine));
    }
    
    @Test
    public void testLineIsNotParalleToAnotherWithDifferentMValue()
    {
        Line firstLine = new Line(new Point(),new Point(5,3));
        Line secondstLine = new Line(new Point(0,0),new Point(5,0));
        assertFalse(firstLine.isParalleTo(secondstLine));
    }
    @Test
    public void testLineIsNotParalleToAnotherWithDifferentMValue2()
    {
        Line firstLine = new Line(new Point(0,2),new Point(7,15));
        Line secondstLine = new Line(new Point(0,4),new Point(7,17));
        assertTrue(firstLine.isParalleTo(secondstLine));
    }
    @Test
    public void testIntersectTwoLines()
    {
        Line firstLine = new Line(new Point(3,1),new Point(5,1));
        Line secondstLine = new Line(new Point(0,0),new Point(2,2));
        assertEquals(1,firstLine.intersect(firstLine,secondstLine).getX(),0);
        assertEquals(1,firstLine.intersect(firstLine,secondstLine).getY(),0);
        /*Line firstLine = new Line(new Point(2,2),new Point(4,2));
        Line secondstLine = new Line(new Point(2,1),new Point(4,1));
        assertEquals(1,firstLine.intersect(firstLine,secondstLine).getX(),0);
        assertEquals(1,firstLine.intersect(firstLine,secondstLine).getY(),0);*/
    }
    @Test
    public void testLengthOgLineIsAlwaysGreatherThanZero()
    {
        Line line = new Line(new Point(0,1),new Point(2,2));
        assertTrue(line.length() > 0);
    }
    @Test
    public void testLengthOfLineIsDeterminedByTheDistanceBetweenItsPoints()
    {
        Line line = new Line(new Point(0,0),new Point(3,4));
        assertEquals(5,line.length(),0);
    }
    @Test
    public void testPointAtleft()
    {
        Line line = new Line(new Point(4,2), new Point(9,5));
        boolean isAtleft = line.isAtleft(new Point(6,5));
        
        assertTrue(isAtleft);
    }
    @Test
    public void testPointThatBelongs ()
    {}
}