public class ComplexShape implements Shape {
    private Shape[] shapes;

    public ComplexShape(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public void beDrawn(ShapeVisitor visitor) {
        for (Shape shape : shapes) {
            shape.beDrawn(visitor);
        }
        System.out.println("Complex shape drawn");
    }
}
