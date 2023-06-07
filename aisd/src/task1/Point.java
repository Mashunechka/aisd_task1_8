package task1;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(Point p) {
        double dx = p.getX() - x;
        double dy = p.getY() - y;

        return Math.sqrt(dx*dx +  dy*dy);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
