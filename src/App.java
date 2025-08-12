public class App {
    public static void main(String[] args) throws Exception {
        Shape rect = new Rectangle(2000, 2000);
        rect.display();

        Shape safeRect = new RectangleProxy(2000, 2000);
        safeRect.display();
    }
}
