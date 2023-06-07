package task1;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public boolean exists() { //метод определяющий существует ли треугольник
        double sideAB = a.distanceTo(b);
        double sideBC = b.distanceTo(c);
        double sideAC = c.distanceTo(a);

        return (sideAB + sideAC > sideBC) && (sideAB + sideBC > sideAC) && (sideAC + sideBC > sideAB);
    }

    public double getPerimeter() { 
        double sideAB = a.distanceTo(b);
        double sideBC = b.distanceTo(c);
        double sideAC = c.distanceTo(a);

        return sideAB + sideBC + sideAC;
    }

    public double getArea() {
        double sideAB = a.distanceTo(b);
        double sideBC = b.distanceTo(c);
        double sideAC = c.distanceTo(a);
        double p = (sideAB + sideBC + sideAC) / 2;

        return Math.sqrt(p*(p - sideAB)*(p - sideBC)*(p - sideAC));
    }

    public boolean containsPoint(Point p) { //метод определяющий приндлежит ли точка Р треугольнику АВС
        double abcArea = getArea();
        double abpArea = new Triangle(a, b, p).getArea();
        double acpArea = new Triangle(a, c, p).getArea();
        double bcpArea = new Triangle(b, c, p).getArea();

        return Math.abs(abcArea - (abpArea + acpArea + bcpArea)) < 0.0001;
    }
}

