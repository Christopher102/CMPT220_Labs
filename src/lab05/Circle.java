package lab05;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        setArea();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(){
        this.area = (Math.pow(this.radius, 2)) * Math.PI;
    }

    public double getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "Radius = " + this.radius +
                " Area = " + this.area;
    }
}
