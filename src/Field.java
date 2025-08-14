import java.util.Random;

public class Field {
    private Mediator mediator;

    public Field(Mediator mediator) {
        this.mediator = mediator;
    }

    public void movePlayer(Player player, int x, int y) {
        mediator.notifyAllExcept("Moving player " + player.getName() + " to coordinates: (" + x + ", " + y + ")", player);
    }

    public void shootPlayer(Player player, Player victim) {
        Random r = new Random();
        int chance = r.nextInt(100);
        if (chance < 50) {
            mediator.notifyPlayer("Player " + player.getName() + " missed the shot at " + victim.getName(), player);
        } else {
            mediator.notifyAll("Player " + player.getName() + " hit " + victim.getName());
        }
    }
}