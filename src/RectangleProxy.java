public class RectangleProxy implements Shape {
    private Rectangle rectangle;
    private double length;
    private double width;

    public RectangleProxy(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void display() throws Exception {
        if (length > 1080 || width > 1920) {
            throw new Exception("Warning: Rectangle dimensions exceed standard display limits.");
        }
        if (rectangle == null) {
            rectangle = new Rectangle(length, width);
        }
        this.rectangle = new Rectangle(length, width);
        rectangle.display();
    }
    
}
