import java.awt.*;

public class Triangle extends Shape {
    private int base, height;

    public Triangle(int a, int b, int base, int height) {
        super(a, b);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw(Graphics g) {
        Polygon polygon = new Polygon();
        polygon.addPoint(getX(), getY());
        polygon.addPoint(getX(), getY() + base);
        polygon.addPoint(getX() + height, getY());
        g.drawPolygon(polygon);
    }
}
