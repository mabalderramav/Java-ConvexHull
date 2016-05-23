package convexhull;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PointSetTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PointSetTest
{
    @Test
    public void testAssAPointToAnEmptySet()
    {
        PointSet set = new PointSet();
        set.add(new Point());
    }
    @Test
    public void testAdddDuplicatePoints()
    {
        PointSet set = new PointSet();
        set.add(new Point(1,1));
        set.add(new Point(1,1));
        assertEquals(1,set.size());
    }
}