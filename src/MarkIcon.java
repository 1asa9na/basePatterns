public class MarkIcon extends Icon {
    public MarkIcon(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.print(" *MARK* ");
    }
}
