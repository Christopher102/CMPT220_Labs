package lab05;

public class Test {

    public static void main(String[] args) {
        Rectangle square = new Rectangle(5, 5);
        Circle oval = new Circle(6);

        System.out.println(square.getArea());
        System.out.println(oval.getArea());
        /**
         * Testing toString because it goes faster here.
         */
        System.out.println(square.toString());
        System.out.println(oval.toString());


    }
}
