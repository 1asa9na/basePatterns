public class App {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();

        Rectangle rectangle = new Rectangle(10, 5);
        shapeFactory.setShape(rectangle);
        Shape clonedRectangle = shapeFactory.createShapeCopy();
        clonedRectangle.printDetails();

        Circle circle = new Circle(7);
        shapeFactory.setShape(circle);
        Shape clonedCircle = shapeFactory.createShapeCopy();
        clonedCircle.printDetails();
    }
}
