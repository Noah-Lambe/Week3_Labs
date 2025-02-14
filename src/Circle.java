public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private final static double PI = 3.14;

    public Circle() {
        // Default constructor
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
