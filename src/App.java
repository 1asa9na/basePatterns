public class App {
    public static void main(String[] args) throws Exception {
        Painter painter = new Painter("Alice");

        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(7);
        Shape complexShape = new ComplexShape(new Shape[]{rectangle, circle});

        complexShape.beDrawn(painter);
    }
}
