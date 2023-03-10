import java.awt.*;

public class Circle extends Shape {
    private int radius;

    public Circle(int a, int b, int randInt) {
        super(a, b);
        radius = randInt;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2d);
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(getX(), getY(), radius, radius);
    }

    /**
     * Method to get the value of radius
     * <br/>
     * Documentation auto-generated by Randy Halim's IntelliJ tool.
     */
    public int getRadius() {
        return radius;
    }

    /**
     * Set method for radius
     * This method will set the value of radius with the provided parameter
     * of type int.
     * <br/>
     * Documentation generated by Randy Halim's IntelliJ template.
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
