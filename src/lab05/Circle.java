package lab05;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        setArea();
    }

    /**
     * This method gets the value of the radius of the circle
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * This sets the radius of the circle
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * This sets the area of the circle using math
     */
    public void setArea(){
        this.area = (Math.pow(this.radius, 2)) * Math.PI;
    }

    /**
     * This gets the area of the circle
     * @return area
     */
    public double getArea() {
        return area;
    }

    /**
     * This creates a string that reads out the value of the circle
     * @return a string with the values in it
     */
    @Override
    public String toString() {
        return "Circle: " +
                "Radius = " + this.radius +
                " Area = " + this.area;
    }
}
