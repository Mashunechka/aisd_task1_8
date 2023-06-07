package task1;

public class TriangleTest {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(3, 0);
        Point c = new Point(0, 4);
        Point p = new Point(1, 1);

        Triangle triangle = new Triangle(a, b, c);
        if (triangle.exists()) {
            System.out.println("Perimeter: " + triangle.getPerimeter());
            System.out.println("Area: " + triangle.getArea());
            System.out.println("Is point P: " + triangle.containsPoint(p));
        } else {
            System.out.println("Triangle does not exist");
        }
    }
}
