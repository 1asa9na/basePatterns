public class LongMoveCommand extends MacroCommand {
    private double distance;

    public LongMoveCommand(Command cmd, double distance) {
        super(cmd);
        this.distance = distance;
    }

    @Override
    public void run() {
        cmd.run();
        System.out.println("Moving long distance: " + distance);
    }
}
