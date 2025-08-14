public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void beDrawn(ShapeVisitor visitor) {
        visitor.visit(this);
        System.out.println("Drawing a rectangle with width: " + width + " and height: " + height);
    }
}
