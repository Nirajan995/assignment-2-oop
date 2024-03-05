public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(); // Using default constructor
        Circle circle2 = new Circle(2.5); // Using constructor with radius parameter
        Circle circle3 = new Circle(3.0, "blue"); // Using constructor with radius and color parameters

        // Displaying information about the circles
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Color: " + circle1.getColor() + ", Area: "
                + circle1.getArea());
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Color: " + circle2.getColor() + ", Area: "
                + circle2.getArea());
        System.out.println("Circle 3 - Radius: " + circle3.getRadius() + ", Color: " + circle3.getColor() + ", Area: "
                + circle3.getArea());

        // We cannot setRadius() because it return void which cannot be printed
        // System.out.println(c4.setRadius(4.4));

        // 3. Attempting to access radius directly will cause a compilation error
        // circle1.radius=5.0; // This line will cause a compilation error
        // System.out.println(circle1.radius); // This line will cause a compilation
        // error

        /// 4 setters and getter method

        Circle c4 = new Circle(3.0, "blue");

        c4.setRadius(5.5);
        System.out.println("Radius is " + c4.getRadius());
        c4.setColor("Green");
        System.out.println("Color is " + c4.getColor());

        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString()); // explicit call
        Circle c6 = new Circle(6.6);

        // 6.explicit call to toString()
        System.out.println(c6.toString()); // explicit call

        System.out.println(c6); // implicit call

    }
}
