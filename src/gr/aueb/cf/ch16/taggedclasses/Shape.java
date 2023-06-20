package CodingFactory23A.src.gr.aueb.cf.ch16.taggedclasses;

public class Shape {
    private enum Type { RECTANGLE, CIRCLE }


    // Tag Field
    private final Type type;

    // Fields for Rectangle
    private double width;
    private double height;

    // Fields for Circle
    private double radius;

    public Shape(double width, double height) {
        type = Type.RECTANGLE;
        this.width = width;
        this.height = height;
    }

    // Constructor for Circle
    public Shape(double radius) {
        type = Type.CIRCLE;
        this.radius = radius;
    }

    public Type getType() {
        return type;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
