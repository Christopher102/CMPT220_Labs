package lab05;

public class Rectangle {
    private double height = 0.0;
    private double length = 0.0;
    private double area = 0.0;


    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;

    }

    public double getHeight() {
        return this.height;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        setArea();
        return this.area;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private void setArea() {
        this.area = this.length * this.height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle: " +
                "Length = " + this.length +
                " Height = " + this.height +
                " Area = " + this.area;
    }
}