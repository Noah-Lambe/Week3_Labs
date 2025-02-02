public class TestMyCircle {
    public static void main(String[] args) {
        // Test default constructor and basic getters
        System.out.println("=== Testing Default Constructor ===");
        MyCircle circle1 = new MyCircle();
        System.out.println("circle1: " + circle1);
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Center (using getCenter): " + circle1.getCenter());
        System.out.println("Center X: " + circle1.getCenterX());
        System.out.println("Center Y: " + circle1.getCenterY());
        System.out.println("Center XY (sum of x and y): " + circle1.getCenterXY());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());

        // Test constructor with radius and coordinates
        System.out.println("\n=== Testing Constructor with Radius and Coordinates ===");
        MyCircle circle2 = new MyCircle(5, 10, 15);
        System.out.println("circle2: " + circle2);
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Center (using getCenter): " + circle2.getCenter());

        // Test constructor with radius and MyPoint center
        System.out.println("\n=== Testing Constructor with Radius and MyPoint ===");
        MyPoint centerPoint = new MyPoint(20, 25);
        MyCircle circle3 = new MyCircle(3, centerPoint);
        System.out.println("circle3: " + circle3);
        System.out.println("Radius: " + circle3.getRadius());
        System.out.println("Center (using getCenter): " + circle3.getCenter());

        // Test setter methods for radius and center
        System.out.println("\n=== Testing Setter Methods ===");
        circle3.setRadius(7);
        System.out.println("Updated radius for circle3: " + circle3.getRadius());
        circle3.setCenter(new MyPoint(30, 35));
        System.out.println("Updated center for circle3: " + circle3.getCenter());

        // Test individual setters for center's x and y
        circle3.setCenterX(40);
        circle3.setCenterY(45);
        System.out.println("After setting centerX and centerY separately: " + circle3.getCenter());

        // Test setCenterXY method
        circle3.setCenterXY(50, 55);
        System.out.println("After setCenterXY(50,55): " + circle3.getCenter());

        // Test getCenterXY method (which returns the sum of x and y)
        System.out.println("Sum of center coordinates (x + y): " + circle3.getCenterXY());

        // Test area and circumference methods
        System.out.println("\n=== Testing Area and Circumference ===");
        System.out.println("Area of circle2: " + circle2.getArea());
        System.out.println("Circumference of circle2: " + circle2.getCircumference());

        // Test distance method between two circles
        System.out.println("\n=== Testing Distance Method ===");
        double distance = circle2.distance(circle3);
        System.out.println("Distance between circle2 and circle3: " + distance);
    }
}
