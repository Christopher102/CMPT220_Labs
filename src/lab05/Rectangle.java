package lab05;

public class Rectangle {
    private double height = 0.0;
    private double length = 0.0;
    private double area = 0.0;


    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;

    }

    /**
     * Gets the height of the rectangle
     * @return height
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Gets the length of the rectangle
     * @return length
     */
    public double getLength() {
        return this.length;
    }

    /**
     * Gets the area of the rectangle
     * @return area
     */
    public double getArea() {
        setArea();
        return this.area;
    }

    /**
     * Sets the height of the rectangle
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Sets the Area of the rectangle
     */
    private void setArea() {
        this.area = this.length * this.height;
    }

    /**
     * Sets the Length of the rectangle
     * @param length
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Creates a string of the values of the rectangle
     * @return Rectangle length, height, area.
     */
    @Override
    public String toString() {
        return "Rectangle: " +
                "Length = " + this.length +
                " Height = " + this.height +
                " Area = " + this.area;
    }
}