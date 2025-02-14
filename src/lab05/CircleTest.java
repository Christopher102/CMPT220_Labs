package lab05;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    static Circle circle;

    /**
     * Creates a circle
     */
    @BeforeAll
    private static void setUp(){
        circle = new Circle(6);
    }

    /**
     * Tests getRadius
     */
    @Test
    public void getRadius() {
        circle.setRadius(6);
        assertEquals(6, circle.getRadius());
    }

    /**
     * Tests setRadius
     */
    @Test
    void setRadius() {
        circle.setRadius(8);
        assertEquals(8, circle.getRadius());
    }

    /**
     * Tests setArea
     */
    @Test
    void setArea() {
        circle.setRadius(6);
        assertEquals((Math.pow(circle.getRadius(), 2)) * Math.PI, circle.getArea());
    }

    /**
     * Tests getArea
     */
    @Test
    void getArea() {
        assertEquals(((6*6)*Math.PI), circle.getArea());
    }
}