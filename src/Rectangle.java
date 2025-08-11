public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void printDetails() {
        System.out.println("Rectangle with length: " + length + " and width: " + width);
    }

    @Override
    public Object copy() {
        return new Rectangle(length, width);
    }
}
