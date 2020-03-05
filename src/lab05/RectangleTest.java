package lab05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    static Rectangle rectangle;

    @BeforeAll
    private static void setUp() {
        rectangle = new Rectangle(10, 10);
    }

    @Test
    public void getHeightTest() {
        double height = rectangle.getHeight();
        assertEquals(10, height);
    }

    @Test
    public void getLengthTest() {
        assertEquals(10, rectangle.getLength());
    }

    @Test
    public void getAreaTest() {
        assertEquals(100, rectangle.getArea());
    }

    @Test
    public void setAreaTest() {
        assertEquals(100, rectangle.getArea());
    }


}