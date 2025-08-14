import java.util.ArrayList;
import java.util.List;

public class Mediator {
    private List<Player> players = new ArrayList<>();
    private Field field;

    public void setField(Field field) {
        this.field = field;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void sendMessage(Message message) {
        switch(message.getType()) {
            case "move":
                int[] data = (int[]) message.getData();
                Player player = message.getPlayer();
                field.movePlayer(player, data[0], data[1]);
                break;
            case "shoot":
                Player victim = (Player) message.getData();
                field.shootPlayer(message.getPlayer(), victim);;
                break;
        }
    }

    public void notifyAll(String message) {
        for (Player player : players) {
            player.receive(message);
        }
    }

    public void notifyAllExcept(String message, Player exceptPlayer) {
        for (Player player : players) {
            if (!player.equals(exceptPlayer)) {
                player.receive(message);
            }
        }
    }

    public void notifyPlayer(String message, Player player) {
        player.receive(message);
    }
}
