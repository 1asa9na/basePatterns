public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void beDrawn(ShapeVisitor visitor) {
        visitor.visit(this);
        System.out.println("Drawing a circle with radius: " + radius);
    }
}
