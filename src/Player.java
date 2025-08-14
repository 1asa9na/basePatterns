public class Player {
    private String name;
    private Mediator mediator;

    public Player(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName() {
        return name;
    }

    public void move(int x, int y) {
        mediator.sendMessage(new Message("move", this, new int[]{x, y}));
    }

    public void shoot(Player victim) {
        mediator.sendMessage(new Message("shoot", this, victim));
    }

    public void receive(String message) {
        System.out.println("[" + getName() + "] " + message);
    }
}
