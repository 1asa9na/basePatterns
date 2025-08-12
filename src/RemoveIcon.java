public class RemoveIcon extends Icon {
    public RemoveIcon(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.print(" -REMOVE- ");
    }
}
