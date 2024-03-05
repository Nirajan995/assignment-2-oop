public class Circle {
    // Private instance variables
    private double radius;
    private String color;

    // Constructors
    // Default constructor
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    // Constructor with radius parameter
    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    // Constructor with radius and color parameters
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Public methods
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}
