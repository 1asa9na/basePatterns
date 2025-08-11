public class ShapeFactory {
    private Shape shape;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Shape createShapeCopy() {
        return (Shape) shape.copy();
    }
}
