public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    public MyCircle() {
        // Default constructor
    }

    public MyCircle(int radius, int x, int y) {
        this.radius = radius;
        this.center.setXY(x, y);
    }

    public MyCircle(int radius, MyPoint center) {
        this.radius = radius;
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();
    }

    public int getCenterY() {
        return center.getY();
    }

    public void setCenterX(int x) {
        center.setX(x);
    }

    public void setCenterY(int y) {
        center.setY(y);
    }

    public int getCenterXY() {
        return center.getX() + center.getY();
    }

    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    public String toString() {
        return "MyCircle[radius=" + radius + ", center=" + center + "]";
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle other) {
        int dx = center.getX() - other.getCenterX();
        int dy = center.getY() - other.getCenterY();
        return Math.sqrt(dx * dx + dy * dy);
    }

}
