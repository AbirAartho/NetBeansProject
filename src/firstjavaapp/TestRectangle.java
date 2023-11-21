
package firstjavaapp;

public class TestRectangle {
    public static void main(String[] args) {
        Shape shape = new Rectangle(3.0,10.0);
        double area = shape.getArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
