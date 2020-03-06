package lab05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    static Rectangle rectangle;

    /**
     * Creates a rectangle
     */
    @BeforeAll
    private static void setUp() {
        rectangle = new Rectangle(10, 10);
    }

    /**
     * Tests getHeight
     */
    @Test
    public void getHeightTest() {
        double height = rectangle.getHeight();
        assertEquals(10, height);
    }

    /**
     * Tests getLength
     */
    @Test
    public void getLengthTest() {
        assertEquals(10, rectangle.getLength());
    }

    /**
     * Tests getArea
     */
    @Test
    public void getAreaTest() {
        assertEquals(100, rectangle.getArea());
    }

    /**
     * Tests setArea
     */
    @Test
    public void setAreaTest() {
        assertEquals(100, rectangle.getArea());
    }


}