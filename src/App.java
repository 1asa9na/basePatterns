import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        UObject player = new Player();
        System.out.println("Player position: " + player.getProperty("position"));
        System.out.println("Player rotation: " + player.getProperty("angle"));

        Queue<Command> commandQueue = new LinkedList<>();

        Movable movablePlayer = new MovableAdapter(player);
        Rotatable rotatablePlayer = new RotatableAdapter(player);

        commandQueue.add(new MoveCommand(movablePlayer));
        commandQueue.add(new RotateCommand(rotatablePlayer));

        while (!commandQueue.isEmpty()) {
            Command command = commandQueue.poll();
            command.run();
        }

        System.out.println("Player position after commands: " + player.getProperty("position"));
        System.out.println("Player rotation after commands: " + player.getProperty("angle"));
    }
}
