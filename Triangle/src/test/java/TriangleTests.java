import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Created by bagirov on 23.06.2015.
 */
public class TriangleTests {
    Triangle triangle;

    @Before
    public void setUp() {
        triangle = new Rectangle();
    }

    @Test
    public void shouldBeTriangleIfValid() {
        boolean actual = triangle.isTriangle(1,1,1);
        assertEquals (true, actual);
        System.out.println("Test0 completed");
    }

    @Test
    public void shouldBeTriangleIfValidDecimal() {
        boolean actual = triangle.isTriangle(1.123,1.999,1.555);
        assertEquals (true, actual);
        System.out.println("Test1 completed");
    }

    @Test
    public void shouldNotBeTriangleIfNegative() {
        boolean actual = triangle.isTriangle(1,1,-1);
        assertEquals (false, actual);
        System.out.println("Test2 completed");
    }

    @Test
    public void shouldNotBeTriangleIfZero() {
        boolean actual = triangle.isTriangle(0,0,0);
        assertEquals (false, actual);
        System.out.println("Test3 completed");
    }

    @Test
    public void shouldNotBeTriangleIfLongSide() {
        boolean actual = triangle.isTriangle(1,1,2);
        assertEquals (false, actual);
        System.out.println("Test4 completed");
    }
}
