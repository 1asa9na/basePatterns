import java.util.ArrayList;
import java.util.List;

public class MoveCommand implements Command {
    private Movable movable;

    public MoveCommand(Movable movable) {
        this.movable = movable;
    }

    @Override
    public void run() {
        List<Double> newPosition = new ArrayList<>();
        for (int i = 0; i < movable.getPosition().size(); i++) {
            newPosition.add(movable.getPosition().get(i) + movable.getVelocity().get(i));
        }
        movable.setPosition(newPosition);
    }
}
