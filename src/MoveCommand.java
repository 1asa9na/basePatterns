public class MoveCommand implements Command {

    private Direction direction;

    public MoveCommand(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void run() {
        System.out.println("Moving " + direction.name());
    }
    
}
