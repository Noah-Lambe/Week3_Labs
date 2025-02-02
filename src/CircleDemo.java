public class CircleDemo {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.5, "blue");

//        Circle.PI = 22.0 / 7; cannot assign value to private instance

        System.out.println("Circle 1: " + circle1);
        System.out.println("Area of Circle 1: " + circle1.getArea());

        System.out.println("\nCircle 2: " + circle2);
        System.out.println("Area of Circle 2: " + circle2.getArea());
    }
}
