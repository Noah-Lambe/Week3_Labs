public class TestMyTriangle {
    public static void main(String[] args) {
        // Test 1: Using the constructor with coordinate parameters
        System.out.println("=== Test 1: Coordinate Constructor ===");
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println("Triangle 1: " + triangle1.toSring());
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());

        // Test 2: Using the constructor with MyPoint objects
        System.out.println("\n=== Test 2: MyPoint Constructor ===");
        MyPoint p1 = new MyPoint(0, 0);
        // Constructing an equilateral triangle:
        // For an equilateral triangle with side length 4, the height is (sqrt(3)/2)*4 = 2*sqrt(3)
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, (int)(2 * Math.sqrt(3))); // Casting to int for simplicity
        MyTriangle triangle2 = new MyTriangle(p1, p2, p3);
        System.out.println("Triangle 2: " + triangle2.toSring());
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());

        // Test 3: An isosceles triangle (but not equilateral)
        System.out.println("\n=== Test 3: Isosceles Triangle ===");
        // Coordinates chosen so that two sides are equal
        MyTriangle triangle3 = new MyTriangle(0, 0, 4, 0, 2, 3);
        System.out.println("Triangle 3: " + triangle3.toSring());
        System.out.println("Perimeter: " + triangle3.getPerimeter());
        System.out.println("Type: " + triangle3.getType());

        // Test 4: A scalene triangle
        System.out.println("\n=== Test 4: Scalene Triangle ===");
        MyTriangle triangle4 = new MyTriangle(1, 1, 4, 5, 7, 2);
        System.out.println("Triangle 4: " + triangle4.toSring());
        System.out.println("Perimeter: " + triangle4.getPerimeter());
        System.out.println("Type: " + triangle4.getType());
    }
}
