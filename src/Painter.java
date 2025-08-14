
public class Painter implements ShapeVisitor {
    private String name;

    public Painter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void visit(Circle circle) {
        System.out.println(getName() + " is drawing a circle");
    }

    @Override
    public void visit(Rectangle rectangle) {
        System.out.println(getName() + " is drawing a rectangle");
    }
}
